package thinking.in.java.chapter08;
// polymorphism/Shapes4.java
// TIJ4 Chapter Polymorphism, Exercise 4, page 286
/* Add a new shape to Shapes.java and verify in main() that polymorphism works
* for your new type as is does for the old types.
*/
/* Solution includes, in package polymorphism.shape: 
* import static net.mindview.util.System.out.println.*;
*/
import java.util.*;

class Circle2 extends Shape1 {
	@Override public void draw() { System.out.println("Circle2.draw()"); }
	@Override public void erase() { System.out.println("Circle2.erase()"); }
	@Override public void amend() { System.out.println("Circle2.amend()"); }
}


class RandomShapeGenerator4 {
	private Random rand = new Random();
	public Shape1 next() {
		switch(rand.nextInt(4)) {
			default:
			case 0: return new Circle2();
			case 1: return new Square2();
			case 2: return new Triangle2();
			case 3: return new Rectangle2();
		}
	}
}

class Square2 extends Shape1 {
	@Override public void draw() { System.out.println("Square2.draw()"); }
	@Override public void erase() { System.out.println("Square2.erase()"); }
	@Override public void amend() { System.out.println("Square2.amend()"); }
}
 
class Triangle2 extends Shape1 {
	@Override public void draw() { System.out.println("Triangle2.draw()"); }
	@Override public void erase() { System.out.println("Triangle2.erase()"); }
	@Override public void amend() { System.out.println("Triangle2.amend()"); }
}

class Rectangle2 extends Shape1 {
	@Override public void draw() { System.out.println("Rectangle2.draw()"); }
	@Override public void erase() { System.out.println("Rectangle2.erase()"); }
	@Override public void amend() { System.out.println("Rectangle2.amend()"); }
}

public class Shapes4 {
	private static RandomShapeGenerator4 gen = new RandomShapeGenerator4();
	public static void main(String[] args) {
		Shape1[] s = new Shape1[10];
		// fill up the array wth shapes:
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// make polymorphic method calls:
		for(Shape1 shp : s) {
			shp.draw();
			shp.amend();
		}	
	}
}
