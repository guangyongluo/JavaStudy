package com.lwei.thread.P_C_pattern_stack2;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyStack myStack = new MyStack();

		Producer p = new Producer(myStack);

		Consumer r1 = new Consumer(myStack);
		Consumer r2 = new Consumer(myStack);
		Consumer r3 = new Consumer(myStack);
		Consumer r4 = new Consumer(myStack);
		Consumer r5 = new Consumer(myStack);

		P_Thread pThread = new P_Thread(p);
		pThread.start();

		C_Thread cThread1 = new C_Thread(r1);
		C_Thread cThread2 = new C_Thread(r2);
		C_Thread cThread3 = new C_Thread(r3);
		C_Thread cThread4 = new C_Thread(r4);
		C_Thread cThread5 = new C_Thread(r5);
		cThread1.start();
		cThread2.start();
		cThread3.start();
		cThread4.start();
		cThread5.start();
	}

}
