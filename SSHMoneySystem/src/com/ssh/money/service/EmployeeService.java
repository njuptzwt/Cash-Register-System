package com.ssh.money.service;

import java.util.List;

import com.ssh.money.domain.Employee;
import com.ssh.money.domain.PageBean;

public interface EmployeeService {
public void add(Employee employee);
public void save(Employee employee);
public void update();
public PageBean<Employee> findAll(int curpage);
public Employee findByid(String eid);
void delete(String eid);
public List<Employee> findAll();
}
