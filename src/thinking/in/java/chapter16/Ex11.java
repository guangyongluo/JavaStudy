package thinking.in.java.chapter16;
// arrays/Ex11.java
// TIJ4 Chapter Arrays, Exercise 11, page 774
// Show that autoboxing doesn't work with arrays.

public class Ex11 {
	public static void main(String[] args) {
		int[] ia = new int[2];
		ia[0] = new Integer(1); // will be autoboxed to int
		ia[0] = new Integer(2); // autoboxing does work here
		// an array of primitive int:
		System.out.println(ia.getClass().getName());
		Integer[] Ia = new Integer[2];
		Ia[0] = (int)1; // will be autoboxed to Integer
		Ia[1] = (int)2; // autoboxing works here
		// an array of Integer:
		System.out.println(Ia.getClass().getName());
		System.out.println(Ia[0] instanceof Integer);
		for(int i = 0; i < Ia.length; i++)
			System.out.println(Ia[i].getClass().getName());
		// Integer[] cannot be assigned to int[]:
		// ia = Ia; // error: incompatible types
		Ia[0] = (int)ia[0]; // more autoboxing
		System.out.println(Ia[0].getClass().getName());		
	}
}