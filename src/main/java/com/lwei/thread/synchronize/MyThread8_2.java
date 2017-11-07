package com.lwei.thread.synchronize;

public class MyThread8_2 extends Thread {

	private Task8 task;

	public MyThread8_2(Task8 task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();
		task.otherMethod();
	}

}
