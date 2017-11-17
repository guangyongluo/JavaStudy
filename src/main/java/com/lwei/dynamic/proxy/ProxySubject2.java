package com.lwei.dynamic.proxy;

public class ProxySubject2 extends Subject2{

	private RealSubject2 realSubject;
	
	public ProxySubject2() {}
	
	@Override
	public void request() {
        preRequest();
        
        if(realSubject == null) {
        	realSubject = new RealSubject2();
        }
        
        realSubject.request();
        
        postRequest();
	}

	private void preRequest() {
		System.out.println("hello");
	}
	
	private void postRequest() {
		System.out.println("world");
	}
	
}
