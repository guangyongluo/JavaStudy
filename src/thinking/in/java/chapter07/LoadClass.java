package thinking.in.java.chapter07;
// reusing/LoadClass.java
// TIJ4 Chapter Reusing, Exercise 23, page 274
/* Prove that class loading takes place only once. Prove that loading may be caused
* by either the creation of the first instance of the that class of by access of a 
* static member.
*/

class A5 {
	static int j = printInit("A4.j initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 1;
	}
	A5() { System.out.println("A4() constructor"); }	
} 

class B4 extends A5 {
	static int k = printInit("B.k initialized");
	B4() { System.out.println("B4() constructor"); }	
}
	
class C4 {
	static int n = printInitC("C4.n initialized");
	static A5 a = new A5();	
	C4() { System.out.println("C4() constructor"); }
	static int printInitC(String s) {
		System.out.println(s);
		return 1;
	}
}

class D4 {
	D4() { System.out.println("D() constructor"); }
}

public class LoadClass extends B4 {
	static int i = printInit("LoadClass.i initialized");
	LoadClass() { System.out.println("LoadClass() constructor"); }
	public static void main(String[] args) {
		// accessing static main causes loading (and initialization)
		// of A, B, & LoadClass
		System.out.println("hi");
		// call constructors from loaded classes:
		LoadClass lc = new LoadClass();
		// call to static field loads & initializes C:
		System.out.println(C4.a);
		// call to constructor loads D:
		D4 d = new D4();
	}
}
