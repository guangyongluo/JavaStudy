package com.lwei.thread.singleton;

public class MyObject2_2 {

	private static MyObject2_2 myObject;

	private MyObject2_2() {
	}

	public static MyObject2_2 getInstance() {
		try {
			// 此种写法等同于：
			// synchronized public static MyObject getInstance()
			// 的写法，效率一样很低，全部代码被上锁
			synchronized (MyObject2_2.class) {
				if (myObject != null) {
				} else {
					// 模拟在创建之前做一些准备性的工作
					Thread.sleep(3000);

					myObject = new MyObject2_2();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
