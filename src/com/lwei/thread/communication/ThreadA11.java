package com.lwei.thread.communication;

public class ThreadA11 extends Thread {

	private ThreadB11 b;

	public ThreadA11(ThreadB11 b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		try {
			synchronized (b) {
				b.start();
				Thread.sleep(6000);
				// Thread.sleep()不能释放锁！
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
