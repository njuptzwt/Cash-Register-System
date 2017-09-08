package com.ssh.money.dao;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.ssh.money.domain.Commodity;
//没有实现好，代码重用度量，本来可以做的更简单那，更好
public class CommodityDaoImpl extends HibernateDaoSupport implements CommodityDao {

	@Override
	public void add(Commodity commodity) {
		// TODO Auto-generated method stub
		String hql = "";
		String nextCid = "";
		hql = "select max(c.cid) from Commodity c";
		@SuppressWarnings("unchecked")
		List<String> cidlist = (List<String>) this.getHibernateTemplate().find(hql, null);
		// String maxEid=this.getHibernateTemplate().find
		if (cidlist != null) {
			String maxEid = cidlist.get(0);
			String num = maxEid.substring(1);
			int nextnum = Integer.parseInt(num) + 1;
			nextCid = "C" + String.valueOf(nextnum);
		} else {
			nextCid = "C1001";
		}
		commodity.setCid(nextCid);
		this.getHibernateTemplate().save(commodity);
	}

	@Override
	public void delete(String cid) {
		// TODO Auto-generated method stub
		Commodity commodity=this.getHibernateTemplate().get(Commodity.class, cid);
		  System.out.println("查询完毕");
		  System.out.println(commodity.getCname());
	      this.getHibernateTemplate().delete(commodity);
	}

	@Override
	public void save(Commodity commodity) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(commodity);
	}

	@Override
	public Commodity findByid(String cid) {
		// TODO Auto-generated method stub
		Commodity commodity=new Commodity();
		commodity=this.getHibernateTemplate().get(Commodity.class,cid);
	      return commodity;
	}

	@Override
	public List<Commodity> find(int begin, int pagesize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria=DetachedCriteria.forClass(Commodity.class);//反射技巧
		@SuppressWarnings("unchecked")
		List<Commodity> list=(List<Commodity>) this.getHibernateTemplate().findByCriteria(criteria, begin, pagesize);
		return list;
	}

	@Override
	public Integer findCount() {
		// TODO Auto-generated method stub
		Integer total;
		String hql="from Commodity";
		List<Commodity> commoditylist=(List<Commodity>) this.getHibernateTemplate().find(hql, null);
		total=commoditylist.size();
		return total;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
