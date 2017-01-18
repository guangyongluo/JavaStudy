package com.lwei.reflect;

import java.lang.reflect.Constructor;

public class ConstructorDemo {

	public static void main(String[] args) throws Exception{
		//找到User的字节码 
		Class<User> clz = User.class;
		//获取构造器
		Constructor[] cons = clz.getConstructors();
		for(Constructor c : cons)
			System.out.println(c);
		
		System.out.println("=============");
		Constructor[] cons2 = clz.getDeclaredConstructors();
		for(Constructor c : cons2)
			System.out.println(c);
		
		Constructor c = clz.getConstructor(String.class,int.class);
		System.out.println(c);
		
	}
	
}
