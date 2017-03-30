package com.lwei.thread.synchronize;

public class Service9_3 {

	public void testMethod1(MyObject9_3 object) {
		synchronized (object) {
			try {
				System.out.println("testMethod1 ____getLock time=" + System.currentTimeMillis() + " run ThreadName="
						+ Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println("testMethod1 releaseLock time=" + System.currentTimeMillis() + " run ThreadName="
						+ Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
