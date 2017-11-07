package com.lwei.thread.synchronize;

public class MyThreadB5_3 extends Thread {

	private Task task;

	public MyThreadB5_3(Task task) {
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
