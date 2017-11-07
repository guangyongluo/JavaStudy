package com.lwei.annotation;

import java.util.Date;

public class DeprecatedTest {

	@Deprecated
	public void doSomething() {
		System.out.println("Do some things");
	}

	public static void main(String[] args) {
		DeprecatedTest dt = new DeprecatedTest();
		dt.doSomething();

		Date date = new Date();
		date.toLocaleString();
	}
}
