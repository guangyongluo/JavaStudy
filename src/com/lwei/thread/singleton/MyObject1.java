package com.lwei.thread.singleton;

public class MyObject1 {

	private static MyObject1 myObject;

	private MyObject1() {
	}

	public static MyObject1 getInstance() {
		// 延迟加载
		if (myObject != null) {
		} else {
			myObject = new MyObject1();
		}
		return myObject;
	}

}
