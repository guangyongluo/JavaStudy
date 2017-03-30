package com.lwei.thread.lock;

public class MyThreadA7 extends Thread {

	private MyService7 myService;

	public MyThreadA7(MyService7 myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			myService.set();
		}
	}

}
