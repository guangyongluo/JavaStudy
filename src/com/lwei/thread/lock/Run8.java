package com.lwei.thread.lock;

public class Run8 {

	public static void main(String[] args) throws InterruptedException {
		MyService8 service = new MyService8();

		MyThreadA8[] threadA = new MyThreadA8[10];
		MyThreadB8[] threadB = new MyThreadB8[10];

		for (int i = 0; i < 10; i++) {
			threadA[i] = new MyThreadA8(service);
			threadA[i].setName("生产者" + i);
			threadB[i] = new MyThreadB8(service);
			threadB[i].setName("消费者" + i);
			threadA[i].start();
			threadB[i].start();
		}

	}
}
