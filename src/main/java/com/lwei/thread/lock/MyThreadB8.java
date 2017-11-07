package com.lwei.thread.lock;

public class MyThreadB8 extends Thread {

	private MyService8 myService;

	public MyThreadB8(MyService8 myService) {
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
