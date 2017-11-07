package com.lwei.thread.state;

public class MyThread4 extends Thread {

	@Override
	public void run() {
		try {
			synchronized (Lock4.lock) {
				Lock4.lock.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
