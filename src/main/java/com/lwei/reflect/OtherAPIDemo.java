package com.lwei.reflect;

import java.lang.reflect.Modifier;

public class OtherAPIDemo {

	public static void main(String[] args) {
		int mod = OtherAPIDemo.class.getModifiers();
		System.out.println(mod);
		System.out.println(Modifier.toString(mod));
		
		
		System.out.println(OtherAPIDemo.class.getName());
		System.out.println(OtherAPIDemo.class.getSimpleName());
		System.out.println(OtherAPIDemo.class.getPackage().getName());
		System.out.println(OtherAPIDemo.class.getSuperclass());
	}
	
}
