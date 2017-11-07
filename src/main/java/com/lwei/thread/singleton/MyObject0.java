package com.lwei.thread.singleton;

public class MyObject0 {

	// 立刻加载方式=饿汉模式
	private static MyObject0 myObject = new MyObject0();

	private MyObject0() {
	}

	public static MyObject0 getInstance() {
		// 此代码版本为立刻加载
		// 此版本代码的缺陷是不能有其他实例变量
		// 因为getInstance()方法没有同步
		// 所以有可能会出现非线程安全问题
		return myObject;
	}

}
