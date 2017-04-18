package com.lwei.dynamic.proxy;

public class RealSubject1 implements Subject1 {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("From RealSubject1...");
	}

}
