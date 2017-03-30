package com.lwei.thread.P_C_pattern_multiple;

//消费者
public class Consumer {

	private String lock;

	public Consumer(String lock) {
		super();
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				while (ValueObject.value.equals("")) {
					System.out.println("消费者 " + Thread.currentThread().getName() + " WAITING了☆");
					lock.wait();
				}
				System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNABLE了");
				ValueObject.value = "";
				lock.notifyAll();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
