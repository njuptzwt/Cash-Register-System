package com.ssh.money.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.money.domain.Commodity;
import com.ssh.money.domain.PageBean;
import com.ssh.money.service.CommodityService;

public class CommodityAction extends SuperAction implements ModelDriven<Commodity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Commodity commodity=new Commodity();//接收前端的参数使用
    private CommodityService commodityService;//依赖注入service的对象
    private int curpage=1;
	@Override
	public Commodity getModel() {
		// TODO Auto-generated method stub
		return this.commodity;
	}
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
	public CommodityService getCommodityService() {
		return commodityService;
	}
	/**
	 * @param employeeService the employeeService to set
	 */
	public void setCommodityService(CommodityService commodityService) {
		this.commodityService = commodityService;
	}
	//添加员工的操作
	public String addCommodity()
	{
		commodityService.add(commodity);
		return "add_success";
	}
	//按照分页查询，查询员工的信息
	public String findAll()
	{
		PageBean<Commodity> page=new PageBean<Commodity>();
		page=commodityService.findAll(curpage);
		//session.setAttribute("page", page);
		//上下文对象保存对象，和session对象操作不一样，有区别
		ActionContext.getContext().getValueStack().push(page);//这个函数的作用
		return "findAll";
	}
	//删除员工的信息
	public String deleteCommodity()
	{
		//request方式获取请求参数
		String id=request.getParameter("cid");
		commodityService.delete(id);
		return "delete_success";
	}
	//修改更新员工的信息,先查找，并返回信息
	public String UpdateCommodity()
	{
		String id=request.getParameter("cid");
		Commodity commodity=commodityService.findByid(id);
		session.setAttribute("commodity", commodity);
		return "update_success";
	}
	//保存修改后的员工信息
	public String saveCommodity()
	{
		commodityService.save(commodity);
		return "save_success";
	}
	

}
