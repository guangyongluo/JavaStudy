package thinking.in.java.chapter16;
// arrays/Ex19.java
// TIJ4 Chapter A3rrays, Exercise 19, page 778
/* Create a class with an int field that's initialized from a constructor
* argument. Create two arrays of these objects, using identical
* intitialization values for each array, and show that A3rrays.equals() says
* that they are unequal. A3dd an equals() method to your class to fix the
* problem.
*/
import java.util.*;
import static net.mindview.util.Print.*;

class A3 {
	protected int x;
	A3(int x) { this.x = x; }
	public boolean equals(Object b) {
		return (b.getClass().getSimpleName() == "A3" 
			&& this.x == ((A3)b).x) ? true : false;
	}
}

public class Ex19 {
	public static void main(String[] args) {
		A3[] a1 = { new A3(1), new A3(2), new A3(3) };
		A3[] a2 = { new A3(1), new A3(2), new A3(3) };
		print(Arrays.toString(a1));
		print(Arrays.toString(a2));
		print(Arrays.equals(a1, a2));
	}
}