package com.lwei.enumrated;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo1 {

	public static void main(String[] args) {
		EnumSet<FontConstant> enumSet = EnumSet.noneOf(FontConstant.class);
		enumSet.add(FontConstant.Plain);
		enumSet.add(FontConstant.Bold);

		showEnumSet(enumSet);
	}

	public static void showEnumSet(EnumSet<FontConstant> enumSet) {
		Iterator<FontConstant> it = enumSet.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}

}
