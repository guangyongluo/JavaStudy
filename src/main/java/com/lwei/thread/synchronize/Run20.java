package com.lwei.thread.synchronize;

public class Run20 {

	public static void main(String[] args) {
		try {
			MyService20 service = new MyService20();

			MyThread20[] array = new MyThread20[5];
			for (int i = 0; i < array.length; i++) {
				array[i] = new MyThread20(service);
			}
			for (int i = 0; i < array.length; i++) {
				array[i].start();
			}
			Thread.sleep(1000);
			System.out.println(service.aiRef.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
