package com.lwei.thread;

public class TicketDemo {

	public static void main(String[] args) {

		Ticket t = new Ticket();

		Thread t1 = new Thread(t);
		t1.setName("平江区");
		t1.start();

		Thread t2 = new Thread(t);
		t2.setName("园区");
		t2.start();

		Thread t3 = new Thread(t);
		t3.setName("新区");
		t3.start();

	}
}
