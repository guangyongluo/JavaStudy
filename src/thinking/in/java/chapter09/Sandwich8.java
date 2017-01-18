package thinking.in.java.chapter09;
// interfaces/Sandwich8.java
// TIJ4 Chapter Interfaces, Exercise 8, page 320
/* In polymorphism.Sandwich.java, create an interface called FastFood (with
* appropriate methods) and change Sandwich so that it also implements
* FastFood.
*/

interface FastFood {
	void cheeseburger();
	void fries();
	void softDrink();
}

class Meal {
	Meal() { System.out.println("Meal()"); } 
}

class Bread {
	Bread() { System.out.println("Bread()"); } 
}

class Cheese {
	Cheese() { System.out.println("Cheese()"); } 
}

class Lettuce {
	Lettuce() { System.out.println("Lettuce()"); } 
}

class Lunch extends Meal {
	Lunch() { System.out.println("Lunch()"); } 
}

class PortableLunch extends Lunch {
	PortableLunch() { System.out.println("PortableLunch()"); } 
}	

public class Sandwich8 extends PortableLunch implements FastFood {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lunch l = new Lunch();
	public Sandwich8() { System.out.println("Sandwich8()"); }
	public void cheeseburger() {
		System.out.println("Cheeseburger");
	}
	public void fries() {
		System.out.println("Fries");
	}
	public void softDrink(){
		System.out.println("Soft Drink");
	}
	public static void main(String[] args) {
		Sandwich8 s = new Sandwich8();
		s.cheeseburger();
		s.fries();
		s.softDrink();
		
	} 
}