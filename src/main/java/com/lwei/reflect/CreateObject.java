package com.lwei.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObject {

	public static void main(String[] args) throws Exception {
		
		
		Class clazz = Test.class;
		
		Constructor c = clazz.getConstructor();
		
		Object o = c.newInstance();
		
		System.out.println(o);
		
		Constructor<Test> c1 = clazz.getConstructor(String.class);
		
		Test t = c1.newInstance("hello");
		
		System.out.println(t);
				
	}
}
