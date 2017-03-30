package com.lwei.thread.communication;

public class Test10 {

	public static void main(String[] args) {
		try {
			MyThread10 threadTest = new MyThread10();
			threadTest.start();

			threadTest.join(2000);// 只等2秒
			// Thread.sleep(2000);

			System.out.println("  end timer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
