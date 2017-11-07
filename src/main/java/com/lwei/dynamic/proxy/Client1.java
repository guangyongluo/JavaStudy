package com.lwei.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client1 {

	public static void main(String[] args) {
		RealSubject1 rs = new RealSubject1();
		InvocationHandler ds = new DynamicSubject(rs);

		Class<?> cls = rs.getClass();

		Subject1 sub = (Subject1) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), ds);

		sub.request();
	}
}
