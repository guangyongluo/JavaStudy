package com.lwei.thread.synchronize;

public class MyThread20 extends Thread {
	private MyService20 mySerivce;

	public MyThread20(MyService20 mySerivce) {
		super();
		this.mySerivce = mySerivce;
	}

	@Override
	public void run() {
		mySerivce.addNum();
	}

}
