package com.lwei.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject3 implements InvocationHandler{

	private Object subject3;
	
	public DynamicSubject3(RealSubject3 subject3) {
		this.subject3 = subject3;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("Before calling..." + method);

		method.invoke(subject3, args);

		System.out.println("After calling..." + method);

		return null;
		
	}

}
