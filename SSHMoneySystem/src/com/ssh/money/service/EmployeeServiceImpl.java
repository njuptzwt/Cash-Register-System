package com.ssh.money.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.ssh.money.dao.EmployeeDao;
import com.ssh.money.domain.Employee;
import com.ssh.money.domain.PageBean;
@Transactional
//加上事务处理操作才不会出现问题
public class EmployeeServiceImpl implements EmployeeService {
	//注入数据库对象
	private EmployeeDao employeeDao;

	/**
	 * @return the employeeDao
	 */
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	/**
	 * @param employeeDao the employeeDao to set
	 */
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	//按照工号删除员工信息
	public void delete(String eid) {
		// TODO Auto-generated method stub
		System.out.println("调用");
    this.employeeDao.delete(eid);
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public PageBean<Employee> findAll(int curpage) {
		// TODO Auto-generated method stub
		PageBean<Employee> page=new PageBean<Employee>();
		page.setCurpage(curpage);
		int pagesize=10;
		page.setPagesize(pagesize);
		Integer totalcount=employeeDao.findCount();//查找总记录数
		page.setTotalcount(totalcount);
		double tc=totalcount;
		//封装总的页数
		Double num=Math.ceil(tc/pagesize);
		page.setTotalpage(num.intValue());
		//封装每一页的数据集合list
		int begin=(curpage-1)*pagesize;
		//System.out.println(begin);
		List<Employee> list=employeeDao.find( begin,pagesize);
		page.setList(list);
     return page;
	}

	@Override
	//按照工号查询
	public Employee findByid(String eid) {
		// TODO Auto-generated method stub
     return employeeDao.findByid(eid);
	}

	@Override
	//添加员工信息
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.add(employee);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		List<Employee> list=employeeDao.findAll();
		return list;
	}

}
