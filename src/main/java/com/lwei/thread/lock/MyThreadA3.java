package com.lwei.thread.lock;

public class MyThreadA3 extends Thread {

	private MyService3 myService;

	public MyThreadA3(MyService3 myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.waitMethod();
	}

}
