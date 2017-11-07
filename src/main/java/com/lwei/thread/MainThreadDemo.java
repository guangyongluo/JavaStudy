package com.lwei.thread;

public class MainThreadDemo extends Thread {

	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);

		}
	}

	public static void main(String[] args) {
		// get current thread.
		Thread t = Thread.currentThread();
		System.out.println(t);

		try {
			for (int i = 0; i < 10000; i++) {
				System.out.println("main : " + i);
				// Thread.sleep(100);
				Thread.yield();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("----------------");

		new MainThreadDemo().start();
	}

}
