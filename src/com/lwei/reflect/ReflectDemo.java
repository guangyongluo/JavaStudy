package com.lwei.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		Class clz = Arrays.class;
		Method[] ms = clz.getMethods();
		for (Method method : ms) {
			if("asList".equals(method.getName()))
				System.out.println(method);
		}
		System.out.println("====================");
		Method m = clz.getMethod("asList", Object[].class);
		List l = (List) m.invoke(null, new Object[]{new Object[]{"A", "B", "C"}});
	    System.out.println(l);
	}
	
}
