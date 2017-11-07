package com.lwei.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest1<T> {

	public T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}

	public static void main(String[] args) {
		GenericTest1<? extends List> ge1 = null;
		ge1 = new GenericTest1<ArrayList>();
		ge1 = new GenericTest1<LinkedList>();

		GenericTest1<? super List> ge2 = null;
		ge2 = new GenericTest1<Object>();

		GenericTest1<String> ge3 = new GenericTest1<String>();
		ge3.setFoo("hello world");

		GenericTest1<?> ge4 = ge3;
		System.out.println(ge4.getFoo());
		ge4.setFoo(null);
		System.out.println(ge4.getFoo());

		// ge4.setFoo("welcome");
	}

}
