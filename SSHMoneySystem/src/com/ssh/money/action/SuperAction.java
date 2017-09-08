package com.ssh.money.action;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class SuperAction extends ActionSupport
		implements ServletRequestAware, ServletResponseAware, ServletContextAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	protected HttpServletResponse response;//response对象
	protected HttpServletRequest request;
	protected ServletContext context;//servlet上下文
	protected HttpSession session;

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
		this.session = this.request.getSession();
	}

	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.context = context;
	}
}
