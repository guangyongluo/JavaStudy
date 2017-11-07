package com.lwei.thread.communication;

import java.util.ArrayList;
import java.util.List;

public class MyList1 {

	private List list = new ArrayList();

	public void add() {
		list.add("lwei");
	}

	public int size() {
		return list.size();
	}

}
