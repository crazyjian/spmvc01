package com.inspur.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.inspur.service.UserService;

public class UserController implements Controller {

	private UserService userService;
	
	
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		System.out.println("HelloController.handleRequest()");
		req.setAttribute("a", "aaaa");
		userService.add(req.getParameter("name")); 
		return new ModelAndView("MyJsp");
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
}

