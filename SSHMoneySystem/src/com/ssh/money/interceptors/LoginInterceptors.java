package com.ssh.money.interceptors;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
//拦截指定名字的Action
//import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
//拦截指定的方法名字
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptors extends MethodFilterInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//拦截器实现拦截非login的所有方法(当登陆对象为空的时候)
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Object Employee= ActionContext.getContext().getSession().get("Employee");
		if(Employee!=null)
		{
			String result=invocation.invoke();
			return result;
		}
		else
		{
			return "input";
		}
	}
}