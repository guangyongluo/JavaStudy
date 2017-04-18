package com.lwei.reflect;

public class ProxySubject extends Subject {

	private RealSubject realSubject;

	public ProxySubject() {

	}

	@Override
	public void request() {
		preRequest();
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
		postRequest();

	}

	private void preRequest() {
		System.out.println("Hello...");
	}

	private void postRequest() {
		System.out.println("Goodbye...");
	}
}
