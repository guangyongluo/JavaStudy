package com.lwei.thread.lock;

public class Run19 {

	public static void main(String[] args) throws InterruptedException {
		final MyService19 service = new MyService19();

		Runnable runnableRef = new Runnable() {
			@Override
			public void run() {
				service.waitMethod();
			}
		};

		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
	}
}
