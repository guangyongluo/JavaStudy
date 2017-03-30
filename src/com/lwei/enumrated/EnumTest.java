package com.lwei.enumrated;

public class EnumTest {
	public static void main(String[] args) {

		doOps(OpConstant.TURN_LEFT);

	}

	public static void doOps(OpConstant opConstant) {
		switch (opConstant) {
		case TURN_LEFT:
			System.out.println(opConstant.TURN_LEFT);
			break;
		case TURN_RIGHT:
			System.out.println(opConstant.TURN_RIGHT);
			break;
		case SHOOT:
			System.out.println(opConstant.SHOOT);
		}
	}
}

enum OpConstant {
	TURN_LEFT, TURN_RIGHT, SHOOT
}