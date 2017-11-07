package com.lwei.thread;

public class MakeTea2 {

	public static void main(String[] args) {

		BoilThreadRunnable boil = new BoilThreadRunnable();
		Thread t1 = new Thread(boil);
		t1.start();

		WashThreadRunnable wash = new WashThreadRunnable();
		Thread t2 = new Thread(wash);
		t2.start();
	}

}
