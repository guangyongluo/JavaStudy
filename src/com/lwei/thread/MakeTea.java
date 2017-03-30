package com.lwei.thread;

public class MakeTea {

	public static void main(String[] args) {

		BoilThread boil = new BoilThread();
		boil.start();

		WashThread wash = new WashThread();
		wash.start();
	}

}
