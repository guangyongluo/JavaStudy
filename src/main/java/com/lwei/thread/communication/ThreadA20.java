package com.lwei.thread.communication;

public class ThreadA20 extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("在ThreadA线程中取值=" + Tools20.tl.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
