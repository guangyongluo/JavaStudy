package com.lwei.thread;

public class BoilThreadRunnable implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("烧开水...");
			Thread.sleep(10000);
			System.out.println("水开了...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
