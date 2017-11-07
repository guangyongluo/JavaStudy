package thinking.in.java.chapter08;
// polymorphism/Rodent2/Rodent29.java
// TIJ4 Chapter Polymorphism, Exercise 9, page 289
/* Create an inheritance hierarchy of Rodent2:Mouse2, Gerbil, Hamster, etc. In the
* base class, provide methods that are common to all Rodent2s, and override these
* in the derived classes to perform different behaviors depending on the
* specific type of Rodent2. Create an array of Rodent2, fill it with different
* specific types of Rodent2s, and call your base-class methods to see what 
* happens.
*/
/* Solution includes, in same package:
 */  
import java.util.*;
class RandomRodent2GeneRat2or {
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

class Rodent2 {
	private String name = "Rodent2";
	protected void eat() { System.out.println("Rodent2.eat()"); }
	protected void run() { System.out.println("Rodent2.run()"); }
	protected void sleep() { System.out.println("Rodent2.sleep()"); }
	public String toString() { return name; }
}

class Mouse2 extends Rodent2 {
	private String name = "Mouse2";
	protected void eat() { System.out.println("Mouse2.eat()"); }
	protected void run() { System.out.println("Mouse2.run()"); }
	protected void sleep() { System.out.println("Mouse2.sleep()"); }
	public String toString() { return name; }
}

class Rat2 extends Rodent2 {
	private String name = "Rat2";
	protected void eat() { System.out.println("Rat2.eat()"); }
	protected void run() { System.out.println("Rat2.run()"); }
	protected void sleep() { System.out.println("Rat2.sleep()"); }
	public String toString() { return name; }
}

class Squirrel2 extends Rodent2 {
	private String name = "Squirrel2";
	protected void eat() { System.out.println("Squirrel2.eat()"); }
	protected void run() { System.out.println("Squirrel2.run()"); }
	protected void sleep() { System.out.println("Squirrel2.sleep()"); }
	public String toString() { return name; }
}

public class Rodent9 {
	private static RandomRodent2GeneRat2or gen = new RandomRodent2GeneRat2or();
	public static void main(String[] args) {
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