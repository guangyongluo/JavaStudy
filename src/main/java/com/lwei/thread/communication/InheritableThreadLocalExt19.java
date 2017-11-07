package com.lwei.thread.communication;

import java.util.Date;

public class InheritableThreadLocalExt19 extends InheritableThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
