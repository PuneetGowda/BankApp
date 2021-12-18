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


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid = request.getParameter("cid");
		String upwd = request.getParameter("upwd");
		
		
		UserService userService = UserServiceFactory.getUserService();
		String status = userService.checkLogin(cid, upwd);
		
		RequestDispatcher requestDispatcher = null;
		if(status.equals("success")) {
			HttpSession session = request.getSession();
			session.setAttribute("cid", cid);
			requestDispatcher = request.getRequestDispatcher("loggedin.jsp");
			requestDispatcher.forward(request, response);
		} else {
			requestDispatcher = request.getRequestDispatcher("failure.html");
			requestDispatcher.forward(request, response);
		}
	}

}
