package com.lwei.thread.synchronize;

public class MyThreadA5_3 extends Thread {

	private Task task;

	public MyThreadA5_3(Task task) {
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
