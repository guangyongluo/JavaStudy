package com.lwei.thread;

public class Test {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setName("myThread");
			thread.start();
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("run = " + Thread.currentThread().getName() + "\n" + "Thread ID = "
						+ Thread.currentThread().getId());
				System.out.println();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
