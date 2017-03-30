package com.lwei.thread.P_C_pattern_stack;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		Producer p = new Producer(myStack);
		Consumer r = new Consumer(myStack);

		P_Thread pThread = new P_Thread(p);
		C_Thread rThread = new C_Thread(r);
		pThread.start();
		rThread.start();
	}

}
