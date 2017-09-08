package com.ssh.money.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.ssh.money.domain.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {
	// 默认注入了HibernateTemplate的对象
	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		// 判断是添加员工信息还是管理员的信息
		String hql = "";
		String nextEid = "";
		if (employee.getRole().equals("管理员"))
			;
		{
			hql = "select max(e.eid) from Employee e where e.role=?";
			@SuppressWarnings("unchecked")
			List<String> eidlist = (List<String>) this.getHibernateTemplate().find(hql, "管理员");
			// String maxEid=this.getHibernateTemplate().find
			String maxEid = eidlist.get(0);
			String num = maxEid.substring(1);
			int nextnum = Integer.parseInt(num) + 1;
			nextEid = "M" + String.valueOf(nextnum);
		}
		if (employee.getRole().equals("普通员工")) {
			hql = "select max(e.eid) from Employee e where e.role=?";
			@SuppressWarnings("unchecked")
			List<String> eidlist = (List<String>) this.getHibernateTemplate().find(hql, "普通员工");
			// String maxEid=this.getHibernateTemplate().find
			String maxEid = eidlist.get(0);
			String num = maxEid.substring(1);
			int nextnum = Integer.parseInt(num) + 1;
			nextEid = "C" + String.valueOf(nextnum);
		}
		employee.setEid(nextEid);
		this.getHibernateTemplate().save(employee);
	}

	@Override
	public void delete(String eid) {
		// TODO Auto-generated method stub
		System.out.println("开始查询");
		System.out.println(eid);
	  Employee employee=this.getHibernateTemplate().get(Employee.class, eid);
	  System.out.println("查询完毕");
	  System.out.println(employee.getEname());
      this.getHibernateTemplate().delete(employee);
	}

	@Override
	//更新保存操作
	public void save(Employee employee) {
		// TODO Auto-generated method stub
    this.getHibernateTemplate().update(employee);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}


	@Override
	public Employee findByid(String eid) {
		// TODO Auto-generated method stub
      Employee employee=new Employee();
      employee=this.getHibernateTemplate().get(Employee.class,eid);
      return employee;
	}
//查找总的记录数
	@Override
	public Integer findCount() {
		// TODO Auto-generated method stub
		Integer total;
		String hql="from Employee";
		List<Employee> employeelist=(List<Employee>) this.getHibernateTemplate().find(hql, null);
		total=employeelist.size();
		return total;
	}

	@Override
	//返回PageBean中的List对象
	public List<Employee> find(int begin, int pagesize) {
		// TODO Auto-generated method stub
		//数据库的分页操作，Limit关键字
		DetachedCriteria criteria=DetachedCriteria.forClass(Employee.class);//反射技巧
		@SuppressWarnings("unchecked")
		List<Employee> list=(List<Employee>) this.getHibernateTemplate().findByCriteria(criteria, begin, pagesize);
		return list;
	}

	@Override
	//找到所有的对象
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		String hql="from Employee";
		List<Employee> list=(List<Employee>) this.getHibernateTemplate().find(hql, null);
		return list;
	}

}
