package com.ssh.money.domain;

public class NewCommodity {
private int purchasetotalcount;
private Double totalprice;
private Commodity c;
/**
 * @return the purchasetotalcount
 */
public int getPurchasetotalcount() {
	return purchasetotalcount;
}
/**
 * @param purchasetotalcount the purchasetotalcount to set
 */
public void setPurchasetotalcount(int purchasetotalcount) {
	this.purchasetotalcount = purchasetotalcount;
}
/**
 * @return the totalprice
 */
public Double getTotalprice() {
	return totalprice;
}
/**
 * @param totalprice the totalprice to set
 */
public void setTotalprice(Double totalprice) {
	this.totalprice = totalprice;
}
/**
 * @return the c
 */
public Commodity getC() {
	return c;
}
/**
 * @param c the c to set
 */
public void setC(Commodity c) {
	this.c = c;
}
public NewCommodity()
{
	
}
}
