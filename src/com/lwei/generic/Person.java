package com.lwei.generic;

public class Person<T> {

	T t;

	public Person() {

	}

	public void setT(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
}
