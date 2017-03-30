package com.lwei.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Service16 {

	private ReentrantLock lock;

	public Service16(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}

	public void serviceMethod() {
		try {
			System.out.println(lock.isLocked());
			lock.lock();
			System.out.println(lock.isLocked());
		} finally {
			lock.unlock();
		}
	}

}
