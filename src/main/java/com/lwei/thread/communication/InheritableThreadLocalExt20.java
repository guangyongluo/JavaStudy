package com.lwei.thread.communication;

import java.util.Date;

public class InheritableThreadLocalExt20 extends InheritableThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}

	@Override
	protected Object childValue(Object parentValue) {
		return parentValue + " 我在子线程加的!";
	}
}
