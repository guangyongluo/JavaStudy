package com.lwei.thread.synchronize;

public class MyThread5_2 extends Thread {

	private Task task;

	public MyThread5_2(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}

}