package com.lwei.thread.singleton;

public class MyObject2_1 {

	private static MyObject2_1 myObject;

	private MyObject2_1() {
	}

	// 设置同步方法效率太低
	// 整个方法上被加锁
	synchronized public static MyObject2_1 getInstance() {
		try {
			if (myObject != null) {
			} else {
				// 模拟在创建对象前做一些准备性的工作
				Thread.sleep(3000);
				myObject = new MyObject2_1();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
