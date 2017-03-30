package com.lwei.thread.lock;

public class MyThreadB7 extends Thread {

	private MyService7 myService;

	public MyThreadB7(MyService7 myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			myService.get();
		}
	}

}
