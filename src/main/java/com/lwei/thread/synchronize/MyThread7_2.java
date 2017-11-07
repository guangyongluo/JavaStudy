package com.lwei.thread.synchronize;

public class MyThread7_2 extends Thread {

	private Task7 task;

	public MyThread7_2(Task7 task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();
		task.doLongTimeTask();
	}

}
