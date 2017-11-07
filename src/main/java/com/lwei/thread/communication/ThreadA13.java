package com.lwei.thread.communication;

public class ThreadA13 extends Thread {
	private ThreadB13 b;

	public ThreadA13(ThreadB13 b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		try {
			synchronized (b) {
				System.out.println(
						"begin A ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println(
						"  end A ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
