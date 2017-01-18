package com.lwei.reflect;

import java.lang.reflect.Field;

class Person{
	private String name;
	private int age;
	
	public String toString(){
		return "Person [name=" + name + ", age=" + age + "]";
	}
}


public class FieldInvokeDemo {

	public static void main(String[] args) throws Exception {
		Class<Person> clz = Person.class;
		Field nameField = clz.getDeclaredField("name");
		Object obj = clz.newInstance();
//		System.out.println(nameField);
		nameField.setAccessible(true);
		nameField.set(obj, "Leo");
		Field ageField = clz.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 18);
		System.out.println(obj);
		
		System.out.println("====================");
		Object name = nameField.get(obj);
		int age = ageField.getInt(obj);
		System.out.println("" + name + age);
		
	}
	
}
