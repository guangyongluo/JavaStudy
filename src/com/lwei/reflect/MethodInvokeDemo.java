package com.lwei.reflect;

import java.lang.reflect.Method;

public class MethodInvokeDemo {

	
	public static void main(String[] args) throws Exception {
		Class clz = Test1.class;
	    Method sayHiMethod = clz.getMethod("sayHi", String.class);
	    System.out.println(sayHiMethod);
	    Object value = sayHiMethod.invoke(clz.newInstance(), "world");
	    System.out.println(value);
	    System.out.println("======================");
	    
	    Method saySomethingMethod = clz.getDeclaredMethod("saySomething");
	    saySomethingMethod.setAccessible(true);
	    saySomethingMethod.invoke(clz.newInstance());
	    
	    System.out.println("======================");
	    
	    Method sayMethod = clz.getMethod("say");
	    sayMethod.invoke(null);
	    
	    
	    System.out.println("======================");
	    Method talkMethod = clz.getMethod("talk", String[].class);
	    talkMethod.invoke(null, new Object[]{new String[]{"A","B","C"}});
	    
	}
	
}
