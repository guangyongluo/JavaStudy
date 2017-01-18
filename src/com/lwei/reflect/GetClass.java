package com.lwei.reflect;

public class GetClass {

	public static void main(String[] args) throws ClassNotFoundException{
		
		//1.第一种方式：类名.class
		Class<User> clazz1 = User.class;
		System.out.println(clazz1);
		
		//2.第二种方式：Class.forName(Sting className);
		Class<?> clazz2 = Class.forName("com.lwei.reflect.User");
		System.out.println(clazz2);
		
		//3.第三种方式：obj.getClass();得到对象的真实类型
		User user = new User();
		Class clazz3 = user.getClass();
		System.out.println(clazz3);
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz2 == clazz3);
		System.out.println(clazz3 == clazz1);
		
		
		
		
	}
	
}
