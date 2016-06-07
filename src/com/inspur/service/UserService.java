package com.inspur.service;

import com.inspur.dao.UserDao;
import com.inspur.po.User;

public class UserService {
	
	private UserDao userDao;
	
	public void add(String name){
		System.out.println("UserService.add()");
		User u = new User();
		u.setName(name);
		userDao.add(u);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
