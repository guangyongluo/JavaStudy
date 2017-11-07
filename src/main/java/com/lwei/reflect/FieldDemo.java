package com.lwei.reflect;

import java.lang.reflect.Field;

public class FieldDemo {

	public static void main(String[] args) throws Exception{
		Class clz = Student.class;
		Field[] fs = clz.getFields();
		for (Field field : fs) {
			System.out.println(field);
		}
		
		System.out.println("===================");
		
		fs = clz.getDeclaredFields();
		for (Field field : fs) {
			System.out.println(field);
		}
		
		System.out.println("===================");
		
		Field f = clz.getField("name");
		System.out.println(f);
	}
}
