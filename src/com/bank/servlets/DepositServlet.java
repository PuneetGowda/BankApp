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

public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid;
		String udeposit;
		
		RequestDispatcher requestDispatcher = null;
		HttpSession session=request.getSession(false);  
        if(session!=null){  
			try {
				session = request.getSession();
				cid = (String)session.getAttribute("cid");
				udeposit = request.getParameter("udeposit");
				UserService userService = UserServiceFactory.getUserService();
				String status = userService.deposit(cid, udeposit);
				if(status.equals("success")) {
					requestDispatcher = request.getRequestDispatcher("transactionsuccess.html");
					requestDispatcher.forward(request, response);
				} else {
					requestDispatcher = request.getRequestDispatcher("transactionfailure.html");
					requestDispatcher.forward(request, response);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
        } else {
    		requestDispatcher = request.getRequestDispatcher("failure.html");
    		requestDispatcher.forward(request, response);
    	}	
	}
	
}
