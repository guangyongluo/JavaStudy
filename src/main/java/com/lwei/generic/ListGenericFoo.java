package com.lwei.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGenericFoo<T extends List> {

	private T[] fooArray;

	public void setFooArray(T[] fooArray) {
		this.fooArray = fooArray;
	}

	public T[] getFooArray() {
		return fooArray;
	}

	public static void main(String[] args) {
		ListGenericFoo<LinkedList> foo1 = new ListGenericFoo<LinkedList>();
		ListGenericFoo<ArrayList> foo2 = new ListGenericFoo<ArrayList>();

		LinkedList[] linkedList = new LinkedList[10];
		foo1.setFooArray(linkedList);

		ArrayList[] arrayList = new ArrayList[10];
		foo2.setFooArray(arrayList);
	}
}
