package com.rays.bean;

public class PersonBean {

	private String name = null;
	private String age=null;
	
	private PersonBean() {
		
	}
	
	private PersonBean(String name , String age) {
		this.name=name;
		this.age=age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
