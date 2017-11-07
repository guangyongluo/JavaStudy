package com.lwei.thread.group;

public class Run1 {

	public static void main(String[] args) {
		ThreadA1 aRunnable = new ThreadA1();
		ThreadB1 bRunnable = new ThreadB1();

		ThreadGroup group = new ThreadGroup("线程组");

		Thread aThread = new Thread(group, aRunnable);
		Thread bThread = new Thread(group, bRunnable);
		aThread.start();
		bThread.start();

		System.out.println("活动的线程数为：" + group.activeCount());
		System.out.println("线程组的名称为：" + group.getName());

	}
}
