package com.lwei.thread.group;

public class MyThread6 extends Thread {

	public MyThread6(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "准备开始死循环了：)");
		while (!this.isInterrupted()) {
		}
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "结束了:)");
	}

}
