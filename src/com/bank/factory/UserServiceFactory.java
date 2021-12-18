package com.bank.factory;

import com.bank.service.UserService;
import com.bank.service.UserServiceImpl;

public class UserServiceFactory {
	private static UserService userService;
	static {
		userService = new UserServiceImpl();
	}
	public static UserService getUserService() {
		return userService;
	}
}
