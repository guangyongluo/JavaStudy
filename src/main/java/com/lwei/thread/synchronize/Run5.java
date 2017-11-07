package com.lwei.thread.synchronize;

public class Run5 {

	public static void main(String[] args) {
		Task task = new Task();

		MyThread5_1 thread1 = new MyThread5_1(task);
		thread1.start();

		MyThread5_2 thread2 = new MyThread5_2(task);
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
