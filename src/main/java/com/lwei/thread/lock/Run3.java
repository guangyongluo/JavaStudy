package com.lwei.thread.lock;

public class Run3 {

	public static void main(String[] args) {
		MyService3 myService = new MyService3();
		MyThreadA3 a = new MyThreadA3(myService);
		a.start();
	}
}
