package com.lwei.thread.lock;

public class Run7 {

	public static void main(String[] args) throws InterruptedException {
		MyService7 myService = new MyService7();

		MyThreadA7 a = new MyThreadA7(myService);
		a.start();

		MyThreadB7 b = new MyThreadB7(myService);
		b.start();

	}
}
