package thinking.in.java.chapter10;
// innerclasses/Cycles.java
// TIJ4 Chapter Innerclasses, Exercise 16, page 364
/* Modify the solution to Exercise 18 from the Interfaces chapter to use
* anonymous inner classes.
* (Exercise 18, Interface: Create a Cycle interface, with implementations
* Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle,
* and code that uses these factories.
*/

interface Cycle {
	void ride();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	private Unicycle() { System.out.println("Unicycle()"); }
	public void ride() { System.out.println("Ride Unicycle"); }
	public static CycleFactory factory =
		new CycleFactory() {
			public Cycle getCycle() { return new Unicycle(); }
		};
}

class Bicycle implements Cycle {
	private Bicycle() { System.out.println("Bicycle()"); }
	public void ride() { System.out.println("Ride Bicycle"); }
	public static CycleFactory factory =
		new CycleFactory() {
			public Cycle getCycle() { return new Bicycle(); }
		};
}

class Tricycle implements Cycle {
	private Tricycle() { System.out.println("Tricycle()"); }
	public void ride() { System.out.println("Ride Tricycle"); }
	public static CycleFactory factory =
		new CycleFactory() {
			public Cycle getCycle() { return new Tricycle(); }
		}; 
}

public class Cycles {
	public static void rideCycle(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.ride();
	}
	public static void main(String [] args) {
		rideCycle(Unicycle.factory);
		rideCycle(Bicycle.factory);
		rideCycle(Tricycle.factory);	
	}
}