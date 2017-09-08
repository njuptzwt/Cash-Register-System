package com.ssh.money.domain;

public class Employee {
private String eid;
private String password;
private String ename;
private String role;
private String gender;
public Employee(String ename, String password,String role, String gender) {
	super();
	//this.eid = eid;
	this.password=password;
	this.ename = ename;
	this.role = role;
	this.gender = gender;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the eid
 */
public String getEid() {
	return eid;
}
/**
 * @param eid the eid to set
 */
public void setEid(String eid) {
	this.eid = eid;
}
/**
 * @return the ename
 */
public String getEname() {
	return ename;
}
/**
 * @param ename the ename to set
 */
public void setEname(String ename) {
	this.ename = ename;
}
/**
 * @return the role
 */
public String getRole() {
	return role;
}
/**
 * @param role the role to set
 */
public void setRole(String role) {
	this.role = role;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
public Employee() {
	super();
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", role=" + role + ", gender=" + gender + "]";
}

}
