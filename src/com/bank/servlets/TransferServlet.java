package com.bank.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.factory.UserServiceFactory;
import com.bank.service.UserService;


public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid;
		String upwd;
		String utransfer;
		String truname;
		
		RequestDispatcher requestDispatcher = null;
		try {
			cid = request.getParameter("cid");
			upwd = request.getParameter("upwd");
			utransfer = request.getParameter("utransfer");
			truname = request.getParameter("truname");
			
			UserService userService = UserServiceFactory.getUserService();
			String status = userService.transfer(cid, upwd, utransfer, truname);
			
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
	}

}
