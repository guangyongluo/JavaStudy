package com.lwei.thread.singleton;

public class MyObject8 {

	private static MyObject8 instance = null;

	private MyObject8() {
	}

	static {
		instance = new MyObject8();
	}

	public static MyObject8 getInstance() {
		return instance;
	}

}
