package com.lwei.dynamic.proxy;

public class RealSubject2 extends Subject2 {

	public RealSubject2() {}
	
	@Override
	public void request() {
        System.out.println("From real subject.");
	}

}
