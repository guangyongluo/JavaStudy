package com.lwei.enumrated;

import java.util.EnumSet;
import java.util.Iterator;

enum FontConstant {
	Plain, Bold, Italic
}

public class EnumSetDemo {

	public static void main(String[] args) {
		EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain, FontConstant.Bold);
		showEnumSet(enumSet);
		showEnumSet(EnumSet.complementOf(enumSet));
	}

	public static void showEnumSet(EnumSet<FontConstant> enumSet) {
		Iterator<FontConstant> it = enumSet.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
}
