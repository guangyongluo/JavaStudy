package com.lwei.reflect;

import java.util.Date;

public class CreateInstanceDemo {

	public static void main(String[] args) {
		Date d = createInstance(Date.class);
		System.out.println(d);
	}
	
	public static <T> T createInstance(Class<T> clazz){
		try {
			return clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
