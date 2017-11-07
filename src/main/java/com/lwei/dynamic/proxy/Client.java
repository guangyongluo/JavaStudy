package com.lwei.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args){
		Subject realSubject = new RealSubject();
		
		InvocationHandler handler = new DynamicProxy(realSubject);
		
		Subject subject = (Subject)Proxy.newProxyInstance(
				realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(),
				handler);
		
		System.out.println(subject.getClass().getName());
		subject.rent();
		subject.hello("world");
	}
}
