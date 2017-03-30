package com.lwei.thread.communication;

import java.util.Date;

public class ThreadA16 extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				if (Tools16.tl.get() == null) {
					Tools16.tl.set(new Date());
				}
				System.out.println("A " + Tools16.tl.get().getTime());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
