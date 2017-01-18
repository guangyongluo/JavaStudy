package thinking.in.java.chapter09;
// interfaces/Rodent2/Rodent27.java
// TIJ4 Chapter Interfaces, Exercise 7, page 320
// Modify Exercise 9 in the Polymorphism chapter so that Rodent2 is an
// interface.
/* Solution includes, in same package: 
*/
import java.util.*;
class RandomRodent2GeneRat2or1 {
	private Random rand = new Random();
	public Rodent2 next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse2();
			case 1: return new Rat2();
			case 2: return new Squirrel2();			
		}
	}
}


interface Rodent2 {
	String name = "Rodent2";
	void eat(); 
	void run(); 
	void sleep();
	String toString(); 
}

class Mouse2 implements Rodent2 {
	private String name = "Mouse2";
	public void eat() { System.out.println("Mouse2.eat()"); }
	public void run() { System.out.println("Mouse2.run()"); }
	public void sleep() { System.out.println("Mouse2.sleep()"); }
	public String toString() { return name; }
}

class Rat2 implements Rodent2 {
	private String name = "Rat2";
	public void eat() { System.out.println("Rat2.eat()"); }
	public void run() { System.out.println("Rat2.run()"); }
	public void sleep() { System.out.println("Rat2.sleep()"); }
	public String toString() { return name; }
}

class Squirrel2 implements Rodent2 {
	private String name = "Squirrel2";
	public void eat() { System.out.println("Squirrel2.eat()"); }
	public void run() { System.out.println("Squirrel2.run()"); }
	public void sleep() { System.out.println("Squirrel2.sleep()"); }
	public String toString() { return name; }
}

public class Rodent7 {
	private static RandomRodent2GeneRat2or1 gen = new RandomRodent2GeneRat2or1();
	public static void main(String[] args) {
		// Error: cannot instantiate (abstract) interface:
		// Rodent2 x = new Rodent2();
		// But OK to create array of implementing objects:
		Rodent2[] Rodent2s = new Rodent2[10];
		for(Rodent2 r : Rodent2s) {
			r = gen.next();
			System.out.println(r + ": ");
			r.eat();
			r.run();
			r.sleep();			
		}		
	}
}