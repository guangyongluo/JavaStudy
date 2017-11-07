package thinking.in.java.chapter08;
// polymorphism/Shapes.java
// TIJ4 Chapter Polymorphism, Exercise 2, page 286
// Add the @Override annotation to the Shapes example
/* Solution includes, in package polymorphism.Shape: 
* import static net.mindview.util.System.out.println.*;
*/
import java.util.*;

class Circle extends Shape {
	@Override public void draw() { System.out.println("Circle.draw()"); }
	@Override public void erase() { System.out.println("Circle.erase()"); }
}

class RandomShapeGenerator {
	private Random rand = new Random();
	public Shape next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
}

class Shape {
	public void draw() {}
	public void erase() {}
}

class Square extends Shape {
	@Override public void draw() { System.out.println("Square.draw()"); }
	@Override public void erase() { System.out.println("Square.erase()"); }
}
 
class Triangle extends Shape {
	@Override public void draw() { System.out.println("Triangle.draw()"); }
	@Override public void erase() { System.out.println("Triangle.erase()"); }
}



public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[10];
		// fill up the array wth Shapes:
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// make polymorphic method calls:
		for(Shape shp : s)
			shp.draw();	
	}
}
