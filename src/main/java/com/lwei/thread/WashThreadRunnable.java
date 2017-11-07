package com.lwei.thread;

public class WashThreadRunnable implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("开始洗第" + i + "个杯子。。。");
				Thread.sleep(1500);
				System.out.println("第" + i + "个杯子洗干净。");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
