package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultipleXML {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"UserBean.xml" , "PersonBean.xml"});
		
		UserBean user = (UserBean) context.getBean("user");
		    System.out.println("User Login :" + user.getLogin());
		    System.out.println("User Password :" + user.getPassword());
		  
		PersonBean person = (PersonBean) context.getBean("person");
		    System.out.println("Person Name :" + person.getName());
		    System.out.println("Person Age :" + person.getAge());


	}
}
