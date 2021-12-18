package com.bank.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bank.factory.UserServiceFactory;
import com.bank.service.UserService;


public class BalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cid;
		
		RequestDispatcher requestDispatcher=null;
		HttpSession session=request.getSession(false); 
		if(session!=null) {
		try {
			cid = (String)session.getAttribute("cid");
			UserService userService = UserServiceFactory.getUserService();
			String bal = userService.balance(cid);
			if(bal != null) {
				request.setAttribute("result", bal);
				request.getRequestDispatcher("balance.jsp");
			}
			else {
				requestDispatcher = request.getRequestDispatcher("/transactionfailure.html");
				requestDispatcher.forward(request, response);
			}
			}catch(Exception e) {
			e.printStackTrace();
		}
		}
		else {
			requestDispatcher = request.getRequestDispatcher("/failure.html");
			requestDispatcher.forward(request, response);
		}
	}



}
