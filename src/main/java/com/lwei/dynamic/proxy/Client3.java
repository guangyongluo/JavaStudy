package com.lwei.dynamic.proxy;

import java.lang.reflect.Proxy;

public class Client3 {

	public static void main(String[] args) {
		RealSubject3 sub = new RealSubject3();
		DynamicSubject3 ih = new DynamicSubject3(sub);
		
		Subject3 subject = (Subject3)Proxy.newProxyInstance(
				sub.getClass().getClassLoader(),
				sub.getClass().getInterfaces(),
				ih);
		
		subject.request();
	}
}
