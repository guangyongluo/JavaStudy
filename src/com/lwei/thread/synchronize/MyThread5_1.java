package com.lwei.thread.synchronize;

public class MyThread5_1 extends Thread {

	private Task task;

	public MyThread5_1(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}

}
