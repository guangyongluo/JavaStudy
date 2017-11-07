package com.lwei.thread.communication;

import java.util.Date;

public class ThreadLocalExt18 extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
