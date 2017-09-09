package com.ssh.money.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.money.domain.Commodity;
import com.ssh.money.domain.NewCommodity;
import com.ssh.money.domain.PageBean;
import com.ssh.money.service.CommodityService;

public class CommodityAction extends SuperAction implements ModelDriven<Commodity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Commodity commodity = new Commodity();// 接收前端的参数使用
	private CommodityService commodityService;// 依赖注入service的对象
	private int curpage = 1;
	//ArrayList用来初始化List对象，否则会报错！空指针异常,用static对象保存，使得数据不会每次清空
    private static List<NewCommodity> carlist=new ArrayList<NewCommodity>();

	@Override
	public Commodity getModel() {
		// TODO Auto-generated method stub
		return this.commodity;
	}

	public int getCurpage() {
		return curpage;
	}

	/**
	 * @param curpage
	 *            the curpage to set
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
	 * @param employeeService
	 *            the employeeService to set
	 */
	public void setCommodityService(CommodityService commodityService) {
		this.commodityService = commodityService;
	}

	// 添加商品的操作
	public String addCommodity() {
		commodityService.add(commodity);
		return "add_success";
	}

	// 按照分页查询，查询商品的信息
	public String findAll() {
		PageBean<Commodity> page = new PageBean<Commodity>();
		page = commodityService.findAll(curpage);
		// session.setAttribute("page", page);
		// 上下文对象保存对象，和session对象操作不一样，有区别
		ActionContext.getContext().getValueStack().push(page);// 这个函数的作用
		return "findAll";
	}

	// 删除商品的信息
	public String deleteCommodity() {
		// request方式获取请求参数
		String id = request.getParameter("cid");
		commodityService.delete(id);
		return "delete_success";
	}

	// 修改更新商品的信息,先查找，并返回信息
	public String UpdateCommodity() {
		String id = request.getParameter("cid");
		Commodity commodity = commodityService.findByid(id);
		if (commodity == null) {
			this.addFieldError("error_update", "修改对象不存在");
			return "error_update";
		}
		session.setAttribute("commodity", commodity);
		return "update_success";
	}

//	// 查询单个商品返回
//	 public String QueryCommodity()
//	 {
//	 String id=request.getParameter("cid");
//	 Commodity c=commodityService.findByid(id);
//	 
//	 if(c==null)
//	 {
//	 this.addFieldError("error_query", "查询对象不存在");
//	 return "error_query";
//	 }
//	 System.out.println(c.getCid());
//	 clist.add(c);
//	 System.out.println(clist.size());
//	 if(clist!=null)
//	 {
//		 session.setAttribute("clist", clist);
//	 return "query_success";
//	 }
//	 else
//	 {
//	 return "error_query";
//	 }
//	 }
	//查询商品
	public String QueryCommodity() {
		String id = request.getParameter("cid");
		Commodity c = commodityService.findByid(id);
		if (c == null) {
			this.addFieldError("error_query", "查询对象不存在");
			return "error_query";
		}
		session.setAttribute("commodity", c);
		return "query_success";
	}

	// 保存修改后的货物信息
	public String saveCommodity() {
		commodityService.save(commodity);
		return "save_success";
	}

	// 模仿购物车信息
	public String CartCommodity() {
		Double Cprice=0.0;
		NewCommodity Com=new NewCommodity();
		String cid = request.getParameter("cid");//传入商品号
		String purchaseTotal=request.getParameter("count");//传入购买总数,post表单提交的数据，可以用request来接受
		int pt=Integer.parseInt(purchaseTotal);
		System.out.println(cid+"" +pt);
		Commodity c = commodityService.findByid(cid);
		if (c == null) {
			this.addFieldError("error_query", "查询对象不存在");
			return "error_cart";
		}
		Com.setC(c);
		Com.setPurchasetotalcount(pt);
		Double totalprice=c.getPrice()*pt;//传入商品的总价
		Com.setTotalprice(totalprice);
		c.setTotal(c.getTotal()-pt);
		commodityService.save(c);//重新传入后台货物的总数
		carlist.add(Com);
		for(NewCommodity nc:carlist)
		{
			Cprice+=nc.getTotalprice();//计算当前购物车的总价格
		}
		session.setAttribute("CartList", carlist);
		session.setAttribute("Cprice", Cprice);
		return "Cart_list";
	}
	//清空购物车：结算页面
	public String Submit()
	{
		if(carlist!=null)
		{
			carlist.clear();
		}
		return "Submit_success";
	}

}
