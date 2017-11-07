package com.lwei.annotation;

public class OverrideTest {

	@Override
	public String toString() {
		System.out.println("This is Override");
		return "This is Override";
	}

	public static void main(String[] args) {
		OverrideTest or = new OverrideTest();
		or.toString();
	}
}
