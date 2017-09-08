package com.ssh.money.domain;

public class Commodity {
private String cid;
private String cname;
private String description;
//单价
private Double price;
//库存
private int total;
/**
 * @return the price
 */
public Double getPrice() {
	return price;
}
public Commodity(String cid, String cname, String description, Double price, int total) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.description = description;
	this.price = price;
	this.total = total;
}
/**
 * @param price the price to set
 */
public void setPrice(Double price) {
	this.price = price;
}
/**
 * @return the total
 */
public int getTotal() {
	return total;
}
/**
 * @param total the total to set
 */
public void setTotal(int total) {
	this.total = total;
}
/**
 * @return the cid
 */
public String getCid() {
	return cid;
}
/**
 * @param cid the cid to set
 */
public void setCid(String cid) {
	this.cid = cid;
}
/**
 * @return the cname
 */
public String getCname() {
	return cname;
}
/**
 * @param cname the cname to set
 */
public void setCname(String cname) {
	this.cname = cname;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
public Commodity() {
	super();
}

}
