package com.lwei.enumrated;

public enum Color {
	RED, WHITE, BLUE;

	public static void main(String[] args) {
		for (Color color : Color.values()) {
			System.out.println(color);
		}
	}
}
