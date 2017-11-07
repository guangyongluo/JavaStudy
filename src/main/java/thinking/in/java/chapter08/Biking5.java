package thinking.in.java.chapter08;
// polymorphism/biking/Biking5.java
// TIJ4 Chapter Polymorphism, Exercise 5, page 286
/* Starting from Exercise 1, add a wheels() method in Cycle2, which returns the
* number of wheels. MOdify ride() to call wheels() and verify that polymorphism
* works.
*/

class Cycle2 {
	private String name = "Cycle2";
	private int wheels = 0;
	public static void travel(Cycle2 c) {
		System.out.println("Cycle2.ride() " + c);
	}
	public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}
}

class UniCycle2 extends Cycle2 {
	private String name = "UniCycle2";
	private int wheels = 1;
	@Override public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	
}

class BiCycle2 extends Cycle2 {
	private String name = "BiCycle2";
	private int wheels = 2;
	@Override public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	

}

class TriCycle2 extends Cycle2 {
	private String name = "TriCycle2";
	private int wheels = 3;
	@Override public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	
}

public class Biking5 {
	public static void ride(Cycle2 c) {
		c.travel(c);
		System.out.println("wheels: " + c.wheels());
	}
	public static void main(String[] args) {
		UniCycle2 u = new UniCycle2();
		BiCycle2 b = new BiCycle2();
		TriCycle2 t = new TriCycle2();
		ride(u); // upcast to Cycle2
		ride(b);
		ride(t);		
	}
}

