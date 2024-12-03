package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiple {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");
		
		PersonBean person = (PersonBean) context.getBean("person");
		UserBean user =  (UserBean) context.getBean("user");
		
		System.out.println("Person Name :" + person.getName());
		System.out.println("Person Age :" + person.getAge());
		System.out.println("User Login :" + user.getLogin());
		System.out.println("User Password :" + user.getPassword());

		
	}
}
