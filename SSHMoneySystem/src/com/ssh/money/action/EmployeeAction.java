package com.ssh.money.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.money.domain.Employee;
import com.ssh.money.domain.PageBean;
import com.ssh.money.service.EmployeeService;

public class EmployeeAction extends SuperAction implements ModelDriven<Employee>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//必须设置初始化的对象
	private Employee employee=new Employee();
	//依赖注入服务对象,这里通过set方式注入,可以通过@autowired注解来实现,也可以通过构造器方式注入
	private EmployeeService employeeService;
	//分页的初始页面,利用struts的set方式传入参数，传入参数的名字和Field的字段名字一样
	private int curpage=1;
	//private方式使用 private String sid,用struts2的set方式传入值
	/**
	 * @return the curpage
	 */
	public int getCurpage() {
		return curpage;
	}
	/**
	 * @param curpage the curpage to set
	 */
	public void setCurpage(int curpage) {
		this.curpage = curpage;
	}
	/**
	 * @return the employeeService
	 */
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	/**
	 * @param employeeService the employeeService to set
	 */
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	//添加员工的操作
	public String addEmployee()
	{
		employeeService.add(employee);
		//EmployeeService employeeService=new EmployeeServiceImpl();
		return "add_success";
	}
	//按照分页查询，查询员工的信息
	public String findAll()
	{
		PageBean<Employee> page=new PageBean<Employee>();
		page=employeeService.findAll(curpage);
		//session.setAttribute("page", page);
		//上下文对象保存对象，和session对象操作不一样，有区别
		ActionContext.getContext().getValueStack().push(page);
		return "query_list";
	}
	//删除员工的信息
	public String delete()
	{
		//request方式获取请求参数
		String id=request.getParameter("eid");
		employeeService.delete(id);
		return "delete_success";
	}
	//修改更新员工的信息,先查找，并返回信息
	public String Update()
	{
		String id=request.getParameter("eid");
		Employee employee=employeeService.findByid(id);
		session.setAttribute("employee", employee);
		return "update_success";
	}
	
	//保存修改后的员工信息
	public String save()
	{
		employeeService.save(employee);
		return "save_success";
	}
	//登陆成功界面，对不同的员工返回不同的页面！！！！！
	public String Login()
	{
		List<Employee> employeeList=employeeService.findAll();//无参数findAll找到所有对象，进行返回
		String eid=(String) request.getAttribute("eid");//输入唯一的工号
		String password=(String) request.getAttribute("password");//密码
		if(eid.equals("")||eid==null)
		{
			this.addFieldError("userError", "用户名不能为空");
			return INPUT;
		}
		else if(password.equals("")||password==null)
		{
			this.addFieldError("passwordError", "密码不能为空");
			return INPUT;
		}
		for(Employee e:employeeList)
		{
			if(eid.equals(e.getEid()))
			{
				if(password.equals(e.getPassword()))
				{
					session.setAttribute("Employee", e);
					if(e.getRole().equals("管理员"))
					{
					return "manager_login";
					}
					else
					{
						System.out.println("执行");
						return "Common_login";
					}
				}
				else
				{
					this.addFieldError("passwordError", "密码输入错误");
					return INPUT;
				}
			}
		}
		this.addFieldError("userError", "用户名不存在");
		return INPUT;
	}
	//实现注销登陆的功能
	public String Logout()
	{
		session.setAttribute("Employee", null);
		return INPUT;
	}
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return this.employee;
	}
	

}
