package com.lwei.annotation;

public class Test {

	public static void main(String[] args) {
		Class<Child> clazz = Child.class;
		InheritedTest it = clazz.getAnnotation(InheritedTest.class);
		System.out.println(it.annotationType().getName());
	}
}
