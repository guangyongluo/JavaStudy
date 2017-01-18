package thinking.in.java.chapter08;
// polymorphism/biking/Biking17.java
// TIJ4 Chapter Polymorphism, Exercise 17, page 310
/* Using the Cycle1 hierarchy from Exercise 1, add a balance method() to 
* UniCycle1 and BiCycle1, but not to TriCycle1. Create instances of all three
* types and upcast them to an array of Cycle1. Try to call balance() on each
* element of the array an observe the results. Downcast and call balance() and
* observe what happens.
*/

class Cycle1 {
	private String name = "Cycle1";
	public static void travel(Cycle1 c) {
		System.out.println("Cycle1.ride() " + c);
	}
	public String toString() {
		return this.name;
	}
}

class UniCycle1 extends Cycle1 {
	private String name = "UniCycle1";
	public void balance() { System.out.println("Balance UniCycle1"); }
	public String toString() {
		return this.name;
	}	
}

class BiCycle1 extends Cycle1 {
	private String name = "BiCycle1";
	public void balance() { System.out.println("Balance BiCycle1"); }
	public String toString() {
		return this.name;
	}	

}

class TriCycle1 extends Cycle1 {
	private String name = "TriCycle1";
	public String toString() {
		return this.name;
	}	
}

public class Biking17 {
	public static void main(String[] args) {
		Cycle1[] ride = {
			new UniCycle1(),
			new BiCycle1(),
			new TriCycle1(),
		};
		// Compile time error: cannot find balance() method in Cycle1:
		// for(Cycle1 c : ride) {
		//	c.balance();
		// }
		((UniCycle1)ride[0]).balance();
		((BiCycle1)ride[1]).balance();
		// Compile time error: no balance() in TriCycle1:
		// ((TriCycle1)ride[2]).balance();
		// RTTI: ClassCastException: TriCycle1 cannot be cast to BiCycle1:
		// ((BiCycle1)ride[2]).balance();	
	}
}

