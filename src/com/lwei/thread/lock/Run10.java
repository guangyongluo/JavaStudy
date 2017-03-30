package com.lwei.thread.lock;

public class Run10 {

	public static void main(String[] args) throws InterruptedException {
		final Service10 service = new Service10();

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				service.serviceMethod1();
			}
		};

		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}
		Thread.sleep(2000);
		System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待获取锁！");

	}
}
