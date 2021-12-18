package com.bank.service;

public interface UserService {
	public String checkLogin(String cid, String upwd);
	public String register(String cid, String uname, String upwd, String uemail, String umobile, String ubalance);
	public String deposit(String cid, String udeposit);
	public String withdraw(String cid, String uwithdraw);
	public String transfer(String cid, String upwd, String utransfer, String truname);
	public String balance(String cid);
}
