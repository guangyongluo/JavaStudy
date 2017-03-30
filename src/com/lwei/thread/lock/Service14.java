package com.lwei.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Service14 {

	private ReentrantLock lock;

	public Service14(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}

	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("公平锁情况：" + lock.isFair());
		} finally {
			lock.unlock();
		}
	}

}
