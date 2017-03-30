package com.lwei.thread.singleton;

public class MyObject2 {

	private static MyObject2 myObject;

	private MyObject2() {
	}

	public static MyObject2 getInstance() {
		try {
			if (myObject != null) {
			} else {
				// 模拟在创建之前做一些准备性的工作
				Thread.sleep(3000);
				myObject = new MyObject2();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
