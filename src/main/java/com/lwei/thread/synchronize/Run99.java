package com.lwei.thread.synchronize;

public class Run99 {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("我要停止它stopThread=" + Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
