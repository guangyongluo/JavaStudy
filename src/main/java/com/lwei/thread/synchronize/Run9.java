package com.lwei.thread.synchronize;

public class Run9 {

	public static void main(String[] args) throws InterruptedException {
		MyOneList list = new MyOneList();

		MyThread9_1 thread1 = new MyThread9_1(list);
		thread1.setName("A");
		thread1.start();

		MyThread9_2 thread2 = new MyThread9_2(list);
		thread2.setName("B");
		thread2.start();

		Thread.sleep(6000);

		System.out.println("listSize=" + list.getSize());

	}

}
