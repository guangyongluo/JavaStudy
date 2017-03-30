package com.lwei.thread.group;

public class MyThread15 extends Thread {

	private String num = "a";

	public MyThread15() {
		super();
	}

	public MyThread15(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		int numInt = Integer.parseInt(num);
		System.out.println("在线程中打印：" + (numInt + 1));
	}

}
