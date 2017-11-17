package com.lwei.reflect;

public class FooImpl1 implements Foo {

	public FooImpl1() {
		
	}
	
	@Override
	public void doAction() {
        System.out.println("in FooImpl1.doAction()");
	}

}
