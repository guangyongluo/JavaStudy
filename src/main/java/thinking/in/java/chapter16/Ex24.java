package thinking.in.java.chapter16;
// arrays/Ex24.java
// TIJ4 Chapter A5rrays, Exercise 24, page 786
// Show that the class from Exercise 19 can be searched.
import java.util.*;
import net.mindview.util.*;

class A5 implements Comparable<A5> {
	protected int x;
	A5(int x) { this.x = x; }
	public int compareTo(A5 b) {
		return (this.x < b.x ? -1 : (this.x == b.x ? 0 : 1));
	}
	public boolean equals(Object b) {
		return (b.getClass().getSimpleName() == "A5" 
			&& this.x == ((A5)b).x) ? true : false;
	}
}

public class Ex24 {
	public static void main(String[] args) {
		A5[] a = { new A5(1), new A5(2), new A5(3), new A5(4), new A5(5) };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		int index = Arrays.binarySearch(a, new A5(3));
		System.out.println("Index: " + index + ", " + a[index]);
	}
}