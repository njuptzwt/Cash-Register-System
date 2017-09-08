package com.ssh.money.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.ssh.money.dao.CommodityDao;
import com.ssh.money.domain.Commodity;
import com.ssh.money.domain.PageBean;
@Transactional
public class CommodityServiceImpl implements CommodityService {
    //数据库dao对象,依赖注入
	private CommodityDao commodityDao;
	
	/**
	 * @return the commodityDao
	 */
	public CommodityDao getCommodityDao() {
		return commodityDao;
	}

	/**
	 * @param commodityDao the commodityDao to set
	 */
	public void setCommodityDao(CommodityDao commodityDao) {
		this.commodityDao = commodityDao;
	}

	@Override
	public void add(Commodity commodity) {
		// TODO Auto-generated method stub
		commodityDao.add(commodity);
	}

	@Override
	public void save(Commodity commodity) {
		// TODO Auto-generated method stub
		commodityDao.save(commodity);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public PageBean<Commodity> findAll(int curpage) {
		// TODO Auto-generated method stub
		PageBean<Commodity> page=new PageBean<Commodity>();
		page.setCurpage(curpage);
		int pagesize=10;
		page.setPagesize(pagesize);
		Integer totalcount=commodityDao.findCount();//查找总记录数
		System.out.println(totalcount);
		page.setTotalcount(totalcount);
		double tc=totalcount;
		//封装总的页数
		Double num=Math.ceil(tc/pagesize);
		page.setTotalpage(num.intValue());
		//封装每一页的数据集合list
		int begin=(curpage-1)*pagesize;
		//System.out.println(begin);
		List<Commodity> list=commodityDao.find( begin,pagesize);
		page.setList(list);
        return page;
	}

	@Override
	public Commodity findByid(String cid) {
		// TODO Auto-generated method stub
		return commodityDao.findByid(cid);
	}

	@Override
	public void delete(String cid) {
		// TODO Auto-generated method stub
		commodityDao.delete(cid);
	}

}
