package com.lwei.thread.singleton;

public class MyObject3 {

	private static MyObject3 myObject;

	private MyObject3() {
	}

	public static MyObject3 getInstance() {
		try {
			if (myObject != null) {
			} else {
				// 模拟在创建对象前做一些准备性的工作
				Thread.sleep(3000);
				// 使用synchronized (MyObject.class)
				// 虽然部分代码被上锁
				// 但是还是有非线程安全问题
				synchronized (MyObject3.class) {
					myObject = new MyObject3();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
