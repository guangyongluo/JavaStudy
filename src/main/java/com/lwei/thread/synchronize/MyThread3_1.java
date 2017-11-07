package com.lwei.thread.synchronize;

public class MyThread3_1 extends Thread {
	@Override
	public void run() {
		Service service = new Service();
		service.service1();
	}

}
