package com.lwei.thread.synchronize;

public class Run16 {

	public static void main(String[] args) {
		PrintString16 printStringService = new PrintString16();
		new Thread(printStringService).start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
