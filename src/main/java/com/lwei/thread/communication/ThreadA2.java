package com.lwei.thread.communication;

public class ThreadA2 extends Thread {

	private Object lock;

	public ThreadA2(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				if (MyList2.size() != 5) {
					System.out.println("wait begin " + System.currentTimeMillis());
					lock.wait();
					System.out.println("wait end  " + System.currentTimeMillis());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
