package com.bank.pojo;

import javax.persistence.Id;

public class User {
	@Id
	private String cid;
	private String uname;
	private String upwd;
	private String uemail;
	private String umobile;
	private String ubalance;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	public String getUbalance() {
		return ubalance;
	}
	public void setUbalance(String ubalance) {
		this.ubalance = ubalance;
	}
	
}
