package com.lwei.thread.synchronize;

public class Run5_3 {

	public static void main(String[] args) {
		Task task = new Task();

		MyThreadA5_3 thread1 = new MyThreadA5_3(task);
		thread1.start();

		MyThreadB5_3 thread2 = new MyThreadB5_3(task);
		thread2.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long beginTime = CommonUtils.beginTime1;
		if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
			beginTime = CommonUtils.beginTime2;
		}

		long endTime = CommonUtils.endTime1;
		if (CommonUtils.endTime2 > CommonUtils.endTime1) {
			endTime = CommonUtils.endTime2;
		}

		System.out.println("耗时：" + ((endTime - beginTime) / 1000));
	}
}
