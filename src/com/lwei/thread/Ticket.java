package com.lwei.thread;

import java.util.Random;

public class Ticket implements Runnable {

	private static int number = 100;

	@Override
	public void run() {
		while (number > 0) {
			System.out.println(Thread.currentThread().getName() + " : 卖出第" + number-- + "张票");
			try {
				Thread.sleep(new Random().nextInt(10) * 10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
