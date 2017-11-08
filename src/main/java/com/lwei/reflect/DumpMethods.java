package com.lwei.reflect;

import java.lang.reflect.Method;

public class DumpMethods {

	public static void main(String[] args) throws Exception {
		Class<?> classType = Class.forName(args[0]);
		
		Method[] methods = classType.getMethods();
		
		for(int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
	}
	
}
