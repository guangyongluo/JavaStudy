package com.lwei.thread.synchronize;

public class MyThread3_2 extends Thread {
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}

}
