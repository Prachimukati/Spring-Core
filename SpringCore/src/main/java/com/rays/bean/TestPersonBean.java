package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestPersonBean {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("PersonBean.xml");
		PersonBean bean = (PersonBean) context.getBean("person");
		
		System.out.println("Person Name : " + bean.getName());
		System.out.println("Person Age : " + bean.getAge());
	}
}
