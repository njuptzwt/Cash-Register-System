package com.ssh.money.domain;

import java.util.List;
//实现分页查询的操作
public class PageBean<T>{
private int curpage;
private int pagesize;
private int totalcount;
private int totalpage;
private List<T> list;//每一页封装多少数据
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
 * @return the pagesize
 */
public int getPagesize() {
	return pagesize;
}
/**
 * @param pagesize the pagesize to set
 */
public void setPagesize(int pagesize) {
	this.pagesize = pagesize;
}
/**
 * @return the totalcount
 */
public int getTotalcount() {
	return totalcount;
}
/**
 * @param totalcount the totalcount to set
 */
public void setTotalcount(int totalcount) {
	this.totalcount = totalcount;
}
/**
 * @return the totalpage
 */
public int getTotalpage() {
	return totalpage;
}
/**
 * @param totalpage the totalpage to set
 */
public void setTotalpage(int totalpage) {
	this.totalpage = totalpage;
}
/**
 * @return the list
 */
public List<T> getList() {
	return list;
}
/**
 * @param list the list to set
 */
public void setList(List<T> list) {
	this.list = list;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "PageBean [curpage=" + curpage + ", pagesize=" + pagesize + ", totalcount=" + totalcount + ", totalpage="
			+ totalpage + "]";
}



}
