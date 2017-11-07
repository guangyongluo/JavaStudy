package com.lwei.thread.singleton;

public class MyObject5 {

	private volatile static MyObject5 myObject;

	private MyObject5() {
	}

	// 使用双检查机制来解决问题，
	// 既保证了不需要同步代码的异步执行性
	// 又保证了单例的效果
	public static MyObject5 getInstance() {
		try {
			if (myObject != null) {
			} else {
				// 模拟在窗前之前做一些准备性的工作
				Thread.sleep(3000);
				synchronized (MyObject5.class) {
					if (myObject == null) {
						myObject = new MyObject5();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
	// 此版本的代码称为双重检查 Double-Check Locking

}
