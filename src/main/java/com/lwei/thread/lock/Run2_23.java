package com.lwei.thread.lock;

public class Run2_23 {

	public static void main(String[] args) throws InterruptedException {
		Service23 service = new Service23();
		MyThreadA23 myThreadA = new MyThreadA23(service);
		myThreadA.start();

		Thread.sleep(2000);

		MyThreadB23 myThreadB = new MyThreadB23(service);
		myThreadB.start();
	}

}
