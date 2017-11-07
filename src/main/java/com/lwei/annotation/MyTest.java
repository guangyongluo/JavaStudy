package com.lwei.annotation;

public class MyTest {

	@MyAnnotation(hello = "luowei", world = "hello world")
	@Deprecated
	@SuppressWarnings("unchecked")
	public void output() {
		System.out.println("output something");
	}
}
