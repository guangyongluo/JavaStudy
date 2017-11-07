package com.lwei.reflect;

public class ArrayClassInstanceDemo {

	public static void main(String[] args){
		String[] arrt1 = {};
		String[] arrt2 = {"A","B"};
		
		Class clz1 = String[].class;
		Class clz2 = arrt1.getClass();
		Class clz3 = arrt2.getClass();
		
		System.out.println(clz1 == clz2);
		
		
	}
	
}
