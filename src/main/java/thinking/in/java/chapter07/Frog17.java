package thinking.in.java.chapter07;
// reusing/Frog17.java
// TIJ4, Chapter Reusing, Exercise 17, page 262
/* Modify Exercise 16 so that Frog overrides the method definitions from 
* the base class (provides new definitions using the same method 
* signatures). Note what happesn in main(). 
* ( Exersice 16:Create a class called Amphibian. From this, inherit a class
* called Frog. Put appropriate methods in the base class. In main(), create a
* Frog and upcast it to Amphibian, and demonstrate that all the methods still 
* work.)
*/

class Amphibian2 {
	protected void swim() {
		System.out.println("Amphibian swim");		
	}
	protected void speak() {
		System.out.println("Amphibian speak");
	}
	void eat() {
		System.out.println("Amphibian eat");
	}
	static void grow(Amphibian2 a) {
		System.out.println("Amphibian grow");
		a.eat();
	}
}

public class Frog17 extends Amphibian2 {
	@Override protected void swim() {
		System.out.println("Frog swim");		
	}
	@Override protected void speak() {
		System.out.println("Frog speak");
	}
	@Override void eat() {
		System.out.println("Frog eat");
	}
	static void grow(Amphibian2 a) {
		System.out.println("Frog grow");
		a.eat();
	}
	public static void main(String[] args) {
		Frog17 f = new Frog17();
		// call overridden base-class methods:
		f.swim();
		f.speak();
		f.eat();
		// upcast Frog17 to Amphibian argument:
		f.grow(f);
		// upcast Frog17 to Amphibian and call Amphibian method:
		Amphibian2.grow(f);
	}
}