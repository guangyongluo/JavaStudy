package com.lwei.thread.state;

public class MyThread3_2 extends Thread {

	@Override
	public void run() {
		MyService3.serviceMethod();
	}

}
