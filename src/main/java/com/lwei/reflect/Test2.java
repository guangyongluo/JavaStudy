package com.lwei.reflect;

import java.awt.Button;

public class Test2 {

	public static void main(String[] args) {
		Button b = new Button();
		Class<?> c1 = b.getClass();
		System.out.println(c1);
		
		Class<?> c2 = c1.getSuperclass();
		System.out.println(c2);
		
		Class<?> c3 = c2.getSuperclass();
		System.out.println(c3);
		
		Class<?> c4 = c3.getSuperclass();
		System.out.println(c4);
	}
}
