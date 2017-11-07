package thinking.in.java.chapter11;

import java.util.Iterator;
import java.util.Random;

// holding/shape/RcdandomShapeGenerator31.java
// TIJ4 Chapter Holding, Exercise 31, page 434
/* Modify polymorphism/shape/RandomShapeGenerator.java to make it
* Iterable. You'll need to add a constructor that takes the number of
* elements that you want the iterator to produce before stopping. Verify
* that it works.
*/
/* Solution includes, in same package: 
*/
class Shape {
	public void draw() {}
	public void erase() {}
	public void amend() { System.out.println("Shape.amend()"); }
	@Override public String toString() { return "Shape"; }
}
class Circle extends Shape {
	@Override public void draw() { System.out.println("Circle.draw()"); }
	@Override public void erase() { System.out.println("Circle.erase()"); }
	@Override public void amend() { System.out.println("Circle.amend()"); }
	@Override public String toString() { return "Circle"; }
}
class Square extends Shape {
	@Override public void draw() { System.out.println("Square.draw()"); }
	@Override public void erase() { System.out.println("Square.erase()"); }
	@Override public void amend() { System.out.println("Square.amend()"); }
	@Override public String toString() { return "Square"; }
}
class Triangle extends Shape {
	@Override public void draw() { System.out.println("Triangle.draw()"); }
	@Override public void erase() { System.out.println("Triangle.erase()"); }
	@Override public void amend() { System.out.println("Triangle.amend()"); }
	@Override public String toString() { return "Triangle"; }
}

public class RandomShapeGenerator31 implements Iterable<Shape> {
	private Random rand = new Random();
	public Shape make() {		
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
	private Shape[] shapes;
	RandomShapeGenerator31(int n) {
		shapes = new Shape[n];
		for(int i = 0; i < n; i++)
			shapes[i] = make();
				 
	}
	public Iterator<Shape> iterator() {
		return new Iterator<Shape>() {
			private int index = 0;
			public boolean hasNext() {
				return index < shapes.length;
			}
			public Shape next() {
				return shapes[index++];
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}			
		};
	}
	public static void main(String[] args) {
		RandomShapeGenerator31 rsg = new RandomShapeGenerator31(20);
		for(Shape s : rsg)
			System.out.println(s);
	}
}
