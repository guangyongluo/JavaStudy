package thinking.in.java.chapter08;
// polymorphism/Rodent114.java
// TIJ4 Chapter Polymorphism, Exercise 14, page 301
/* Modify Exercise 12 so that one of the member objects is a Shared1 object with 
* reference counting, and demonstRat1e that it works properly.
*/
/* Solution includes, in same package, the following two files: 
* import static org.greggordon.tools.Print.*;
*/
import java.util.*;

class Shared1 {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++; 
	public Shared1() { System.out.println("Creating " + this); }
	public void addRef() { refcount++; }
	public String toString() { return "Shared1 " + id; }
	public void showRefcount() { System.out.println("refcount = " + refcount); }		
}
 // and:


class RandomRodent1GeneRat1or {
	// same Shared1 object to be passed to every Rodent1:
	protected Shared1 Shared1 = new Shared1();
	private Random rand = new Random();
	public Rodent1 next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse1(Shared1);
			case 1: return new Rat1(Shared1);
			case 2: return new Squirrel1(Shared1);			
		}
	}
}



class Characteristic1 {
	private String s;
	Characteristic1(String s) {
		this.s = s;
		System.out.println("Creating Characteristic1 " + s);
	}	
}

class Description1 {
	private String s;
	Description1(String s) {
		this.s = s;
		System.out.println("Creating Description1 " + s);
	}
}

class Rodent1 {
	private String name = "Rodent1";
	private Shared1 Shared1;
	private static long counter = 0;
	private final long id = counter++; 
	private Characteristic1 c = new Characteristic1("has tail");
	private Description1 d = new Description1("small mammal");
	Rodent1(Shared1 Shared1) { 
		System.out.println("Rodent1() " + id); 
		this.Shared1 = Shared1;
		this.Shared1.addRef();
	}
	protected void eat() { System.out.println("Rodent1.eat()"); }
	protected void run() { System.out.println("Rodent1.run()"); }
	protected void sleep() { System.out.println("Rodent1.sleep()"); }
	public String toString() { return name + " " + id; }
}

class Mouse1 extends Rodent1 {
	private String name = "Mouse1";
	private Characteristic1 c = new Characteristic1("likes cheese");
	private Description1 d = new Description1("nocturnal");
	Mouse1(Shared1 Shared1) {
		super(Shared1); 
		System.out.println("Mouse1()");		
	}
	protected void eat() { System.out.println("Mouse1.eat()"); }
	protected void run() { System.out.println("Mouse1.run()"); }
	protected void sleep() { System.out.println("Mouse1.sleep()"); }
	public String toString() { return name + ", " + super.toString(); }
}

class Rat1 extends Rodent1 {
	private String name = "Rat1";
	private Characteristic1 c = new Characteristic1("larger");
	private Description1 d = new Description1("black");
	Rat1(Shared1 Shared1) { 
		super(Shared1);
		System.out.println("Rat1()"); 
	}
	protected void eat() { System.out.println("Rat1.eat()"); }
	protected void run() { System.out.println("Rat1.run()"); }
	protected void sleep() { System.out.println("Rat1.sleep()"); }
	public String toString() { return name + ", " + super.toString(); }
}

class Squirrel1 extends Rodent1 {
	private String name = "Squirrel1";
	private Characteristic1 c = new Characteristic1("climbs trees");
	private Description1 d = new Description1("likes nuts");
	Squirrel1(Shared1 Shared1) { 
		super(Shared1);
		System.out.println("Squirrel1()"); 
	}
	protected void eat() { System.out.println("Squirrel1.eat()"); }
	protected void run() { System.out.println("Squirrel1.run()"); }
	protected void sleep() { System.out.println("Squirrel1.sleep()"); }
	public String toString() { return name + ", " + super.toString(); }
}

public class Rodent14 {
	private static RandomRodent1GeneRat1or gen = new RandomRodent1GeneRat1or();
	public static void main(String[] args) {
		Rodent1[] Rodent1s = new Rodent1[5];
		for(Rodent1 r : Rodent1s) {
			r = gen.next();
			System.out.println(r);
		}
		gen.Shared1.showRefcount();		
	}
}