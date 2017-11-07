package thinking.in.java.chapter15;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// generics.New11.java
// TIJ4 C1hapter Generics, Exercise 11, page 635
// Test New.java by creating your own classes and ensuring that
// New will work properly with them.
import net.mindview.util.New;

class A2 {
	public String toString() {
		return "A2";
	}
}

class B1 {
	public String toString() {
		return "B1";
	}
}

class C1 extends B1 {
	public String toString() {
		return "C1";
	}
}

public class New11 {
	public static void main(String[] args) {
		A2 a = new A2();
		B1 b = new B1();
		C1 c = new C1();
		List<C1> lc = New.list();
		lc.add(new C1());
		Map<A2, List<? extends B1>> mab = New.map();
		mab.put(a, lc);
		LinkedList<B1> llb = New.lList();
		llb.add(new B1());
		Set<A2> sa = New.set();
		sa.add(new A2());
		Queue<B1> qb = New.queue();
		qb.add(new B1());
		System.out.println(lc);
		System.out.println(mab);
		System.out.println(llb);
		System.out.println(sa);
		System.out.println(qb);
	}
}