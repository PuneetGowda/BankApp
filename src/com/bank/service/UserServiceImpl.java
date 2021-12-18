package com.bank.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bank.pojo.User;
import com.bank.util.HibernateUtil;

public class UserServiceImpl implements UserService {
	String status = "";
	
	@Override
	public String checkLogin(String cid, String upwd) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			User user = (User) session.get(User.class, cid);
			if(user == null) {
				status="failure";
			} else {
				if(user.getUpwd().equals(upwd)) {
					status = "success";
				} else {
					status = "failure";
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
		return status;
	}
	
	@Override
	public String register(String cid, String uname, String upwd, String uemail, String umobile, String ubalance) {
		Transaction tx = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session =sessionFactory.openSession();
			User user = (User) session.get(User.class, cid);
			if(user == null) {
				tx = session.beginTransaction();
				user = new User();
				user.setCid(cid);
				user.setUname(uname);
				user.setUpwd(upwd);
				user.setUemail(uemail);
				user.setUmobile(umobile);
				user.setUbalance(ubalance);
				String pk_Val = (String)session.save(user);
				tx.commit();
				if(pk_Val.equals(cid)) {
					status = "success";
				} else {
					status = "existed";
				}
			} else {
				status = "existed";
			}
		} catch (Exception e) {
	
			status = "failure";
			e.printStackTrace();
		}
		finally {
			
			session.close();
			sessionFactory.close();
		}
		return status;
	}
	
	@Override
	public String deposit(String cid, String udeposit) {
		Transaction tx = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session =sessionFactory.openSession();
			
			User user = (User) session.get(User.class, cid);
			
				tx = session.beginTransaction();
				
				user.setCid(cid);
				float balance = Float.parseFloat(user.getUbalance());
				float deposit = Float.parseFloat(udeposit);
				float total = balance + deposit;
				String result = total+"";
				user.setUbalance(result);
				session.update(user);
				tx.commit();
				
				status = "success";
		
		} catch (Exception e) {
		
			status = "failure";
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
		return status;

	}
	
	@Override
	public String withdraw(String cid, String uwithdraw) {
		Transaction tx = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session =sessionFactory.openSession();
			
			User user = (User) session.get(User.class, cid);
			
				tx = session.beginTransaction();
				
				user.setCid(cid);
				float balance = Float.parseFloat(user.getUbalance());
				float withdraw = Float.parseFloat(uwithdraw);
				float total = balance - withdraw;
				String result = total+"";
				user.setUbalance(result);
				session.update(user);
				tx.commit();
				
				status = "success";
		
		} catch (Exception e) {
		
			status = "failure";
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
		return status;

	}
	
	@Override
	public String transfer(String cid, String upwd, String utransfer, String truname) {
		Transaction tx = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session =sessionFactory.openSession();
			
			User user = (User) session.get(User.class, cid);
			
				tx = session.beginTransaction();
				
				user.setCid(cid);
				float balance = Float.parseFloat(user.getUbalance());
				float transfer = Float.parseFloat(utransfer);
				float total = balance - transfer;
				String result = total+"";
				user.setUbalance(result);
				session.update(user);
				
				User user1 = (User) session.get(User.class, truname);
				balance = Float.parseFloat(user1.getUbalance());
				transfer = Float.parseFloat(utransfer);
				total = balance + transfer;
				result = total+"";
				user1.setUbalance(result);
				session.update(user1);
				tx.commit();
				
				status = "success";
		
		} catch (Exception e) {
		
			status = "failure";
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
		return status;
	}	
	
	@Override
	public String balance(String cid) {
		String bal = "";
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			User user = (User) session.get(User.class, cid);
			bal = user.getUbalance();
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
		return bal;
	}	
	
}