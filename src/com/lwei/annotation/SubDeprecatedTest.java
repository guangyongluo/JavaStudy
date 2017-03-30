package com.lwei.annotation;

public class SubDeprecatedTest extends DeprecatedTest {

	@Override
	public void doSomething() {
		System.out.println("Do some things in subclass");
	}

	public static void main(String[] args) {
		SubDeprecatedTest st = new SubDeprecatedTest();
		st.doSomething();
	}

}
