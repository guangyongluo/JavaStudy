package thinking.in.java.chapter08;
// polymorphism/Shape1s3.java
// TIJ4 Chapter Polymorphism, Exercise 3, page 286
/* Add a new method in the base class of Shape1s.java that System.out.printlns a message, but
* don't override it in the derived classes. Explain what happens. Now override
* it in one of the derived classes but not the others and see what happens. 
* Finally override it in all the derived classes.
*/
/* Solution includes, in package polymorphism.Shape1: 
* import static net.mindview.util.System.out.println.*;
*/
import java.util.*;

class Circle1 extends Shape1 {
	@Override public void draw() { System.out.println("Circle1.draw()"); }
	@Override public void erase() { System.out.println("Circle1.erase()"); }
	@Override public void amend() { System.out.println("Circle1.amend()"); }
}

class RandomShape1Generator1 {
	private Random rand = new Random();
	public Shape1 next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle1();
			case 1: return new Square1();
			case 2: return new Triangle1();
		}
	}
}
class Shape1 {
	public void draw() {}
	public void erase() {}
	public void amend() { System.out.println("Shape1.amend()"); }
}

class Square1 extends Shape1 {
	@Override public void draw() { System.out.println("Square1.draw()"); }
	@Override public void erase() { System.out.println("Square1.erase()"); }
	@Override public void amend() { System.out.println("Square1.amend()"); }
}
 
class Triangle1 extends Shape1 {
	@Override public void draw() { System.out.println("Triangle1.draw()"); }
	@Override public void erase() { System.out.println("Triangle1.erase()"); }
	@Override public void amend() { System.out.println("Triangle1.amend()"); }
}



public class Shapes3 {
	private static RandomShape1Generator1 gen = new RandomShape1Generator1();
	public static void main(String[] args) {
		Shape1[] s = new Shape1[10];
		// fill up the array wth Shape1s:
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// make polymorphic method calls:
		for(Shape1 shp : s) {
			shp.draw();
			shp.amend();
		}	
	}
}
