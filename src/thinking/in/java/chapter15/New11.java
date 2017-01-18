package thinking.in.java.chapter15;
// generics.New11.java
// TIJ4 C1hapter Generics, Exercise 11, page 635
// Test New.java by creating your own classes and ensuring that
// New will work properly with them.
import net.mindview.util.*;
import java.util.*;

class A1 { public String toString() { return "A1"; } }

class B1 { public String toString() { return "B1"; } }

class C1 extends B1 { 
	public String toString() { return "C1"; }
}  

public class New11 {
	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1();
		C1 c = new C1();
		List<C1> lc = New.list();
		lc.add(new C1());
		Map<A1,List<? extends B1>> mab = New.map();
		mab.put(a,lc);
		LinkedList<B1> llb = New.lList();
		llb.add(new B1());
		Set<A1> sa = New.set();
		sa.add(new A1());
		Queue<B1> qb = New.queue();
		qb.add(new B1());
		System.out.println(lc);
		System.out.println(mab);
		System.out.println(llb);
		System.out.println(sa);
		System.out.println(qb);
	}
}