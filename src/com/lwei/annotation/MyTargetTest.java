package com.lwei.annotation;

public class MyTargetTest {

	@MyTarget("test")
	public void doSomething() {
		System.out.println("Hello World!");
	}

}
