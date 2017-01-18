package com.lwei.reflect;

import java.lang.reflect.Method;

class Test1{
	
	public String sayHi(String str){
		System.out.println("sayHi()..." + str);
		return str;
	}
	
	public void sayGoodbye(String str, int num){
		System.out.println("sayGoodbye()..." + str + ", " + num);
	}
	
	private void saySomething(){
		System.out.println("saySomething()...");
	}
	
	public static void say(){
		System.out.println("say()...");
	}
	
	public static void talk(String... args){
		System.out.println(args);
	}
}

public class MethodDemo {
	
	public static void main(String[] args) {
		
		Class clz = Test1.class;
		
		Method[] ms = clz.getMethods();
		
		for (Method method : ms) {
			System.out.println(method);
		}
		
		System.out.println("===================");
		
		ms = clz.getDeclaredMethods();
		
		for (Method method : ms) {
			System.out.println(method);
		}
	}

}
