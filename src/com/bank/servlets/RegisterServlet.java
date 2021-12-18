package com.bank.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.factory.UserServiceFactory;
import com.bank.service.UserService;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid = request.getParameter("cid");
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		String uemail = request.getParameter("uemail");
		String umobile = request.getParameter("umobile");
		String ubalance = request.getParameter("ubalance");
		
		UserService userService = UserServiceFactory.getUserService();
		String status = userService.register(cid, uname, upwd, uemail, umobile, ubalance);
		
		RequestDispatcher requestDispatcher = null;
		if(status.equals("success")) {
			requestDispatcher = request.getRequestDispatcher("registersuccess.html");
			requestDispatcher.forward(request, response);
		} else {
			requestDispatcher = request.getRequestDispatcher("registerfailure.html");
			requestDispatcher.forward(request, response);
		}
	}

}
