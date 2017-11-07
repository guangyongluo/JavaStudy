package com.lwei.thread.synchronize;

public class MyThread7_1 extends Thread {

	private Task7 task;

	public MyThread7_1(Task7 task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();
		task.doLongTimeTask();
	}

}
