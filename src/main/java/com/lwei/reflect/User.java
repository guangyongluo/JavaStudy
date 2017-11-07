package com.lwei.reflect;

public class User {
    private String name;
    public int age;
    
    public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
    
    private User(String name){
    	this.name = name;
    }
    
	public User() {	}


	public void test1(){}
    public void test2(){}
    public void test3(){}
}

class Student extends User{
	public String name;
	public int age;
	private int sex;
}
