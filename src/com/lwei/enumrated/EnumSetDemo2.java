package com.lwei.enumrated;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class EnumSetDemo2 {

	public static void main(String[] args) {
		List<FontConstant> list = new ArrayList<FontConstant>();
		list.add(FontConstant.Plain);
		list.add(FontConstant.Bold);

		showEnumSet(EnumSet.copyOf(list));
	}

	public static void showEnumSet(EnumSet<FontConstant> enumSet) {
		Iterator<FontConstant> it = enumSet.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
}
