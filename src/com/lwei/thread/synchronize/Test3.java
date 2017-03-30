package com.lwei.thread.synchronize;

public class Test3 {

	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA3 thread = new ThreadA3(publicVarRef);
			thread.start();

			Thread.sleep(200);// 打印结果受此值大小影响

			publicVarRef.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
