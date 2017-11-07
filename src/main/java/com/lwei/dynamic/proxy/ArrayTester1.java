package com.lwei.dynamic.proxy;

import java.lang.reflect.Array;

public class ArrayTester1 {

	public static void main(String[] args) throws Exception {
		Class<?> classType = Class.forName("java.lang.String");

		Object array = Array.newInstance(classType, 10);

		Array.set(array, 5, "Hello");

		String s = (String) Array.get(array, 5);

		System.out.println(s);
	}
}
