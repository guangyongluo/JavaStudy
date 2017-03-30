package com.lwei.thread.state;

public class MyService3 {

	synchronized static public void serviceMethod() {
		try {
			System.out.println(Thread.currentThread().getName() + "进入了业务方法！");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
