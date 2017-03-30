package com.lwei.thread.communication;

public class ThreadB2 extends Thread {
	private Object lock;

	public ThreadB2(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					MyList2.add();
					if (MyList2.size() == 5) {
						lock.notify();
						System.out.println("已发出通知");
					}
					System.out.println("添加了" + (i + 1) + "个元素!");
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
