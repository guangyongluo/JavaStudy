package com.lwei.thread;

public class Run18 {

	public static void main(String[] args) {

		try {
			MyThread18 thread = new MyThread18();
			thread.start();
			Thread.sleep(5000);
			// A
			thread.suspend();
			System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());
			Thread.sleep(5000);
			System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());
			// B
			thread.resume();
			Thread.sleep(5000);

			// C
			thread.suspend();
			System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
			Thread.sleep(5000);
			System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
