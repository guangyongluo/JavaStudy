package com.lwei.thread.state;

public class MyThread3_1 extends Thread {

	@Override
	public void run() {
		MyService3.serviceMethod();
	}

}
