package com.lwei.thread.synchronize;

public class Service20 {

	private boolean isContinueRun = true;

	public void runMethod() {
		String anyString = new String();
		while (isContinueRun == true) {
			// synchronized (anyString) {
			// }
		}
		System.out.println("停下来了！");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
}
