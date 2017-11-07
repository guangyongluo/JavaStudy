package com.lwei.thread.synchronize;

public class Run21 {

	public static void main(String[] args) {
		try {
			Service20 service = new Service20();

			ThreadA20 a = new ThreadA20(service);
			a.start();

			Thread.sleep(1000);

			ThreadB20 b = new ThreadB20(service);
			b.start();

			System.out.println("已经发起停止命令了！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
