package com.rays.autowire.bytype;

public class UserService {

	private UserDao userDao; // UserDao is property Type   

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	
	}

	public void testAdd() {
		userDao.add();
	}

}
