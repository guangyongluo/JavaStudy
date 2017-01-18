package com.lwei.generic;

import java.util.Collection;

public class Needs {

	public void copy(Object[] objects, Collection<Object> cs) {
		for (Object obj : objects) {
			cs.add(obj);
		}
	}

	public <T> void copyFromArrayToCollection(T t[], Collection<T> cs) {
		for (T t2 : t) {
			cs.add(t2);
		}
	}

	public <T> void test(Collection<T> c) {

	}

}
