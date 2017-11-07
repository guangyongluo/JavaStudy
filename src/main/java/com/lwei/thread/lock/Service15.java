package com.lwei.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Service15 {

	private ReentrantLock lock;

	public Service15(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}

	public void serviceMethod() {
		try {
			System.out.println(lock.isHeldByCurrentThread());
			lock.lock();
			System.out.println(lock.isHeldByCurrentThread());
		} finally {
			lock.unlock();
		}
	}

}
