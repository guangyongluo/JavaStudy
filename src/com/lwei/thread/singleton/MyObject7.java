package com.lwei.thread.singleton;

public class MyObject7 {

	// 内部类方式
	private static class MyObjectHandler {
		private static MyObject7 myObject = new MyObject7();
	}

	private MyObject7() {
	}

	public static MyObject7 getInstance() {
		return MyObjectHandler.myObject;
	}

}
