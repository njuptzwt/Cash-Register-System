package com.ssh.money.dao;

import java.util.List;

import com.ssh.money.domain.Employee;

public interface EmployeeDao {
	public void add(Employee employee);
	public void save(Employee employee);
	public void update();
	public Integer findCount();
	public List<Employee> find(int begin, int pagesize);
	public Employee findByid(String eid);
	void delete(String eid);
	public List<Employee> findAll();
}
