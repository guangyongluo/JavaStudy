package com.lwei.thread.group;

public class MyThread13 extends Thread {

	private String num;

	public MyThread13(ThreadGroup group, String name, String num) {
		super(group, name);
		this.num = num;
	}

	@Override
	public void run() {
		int numInt = Integer.parseInt(num);
		while (true) {
			System.out.println("死循环中：" + Thread.currentThread().getName());
		}

	}

}
