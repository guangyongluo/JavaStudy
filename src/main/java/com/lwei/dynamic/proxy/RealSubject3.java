package com.lwei.dynamic.proxy;

public class RealSubject3 implements Subject3{

	@Override
	public void request() {
		System.out.println("From real subject...");
	}

}
