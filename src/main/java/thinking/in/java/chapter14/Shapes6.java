package thinking.in.java.chapter14;
// typeinfo/Shape1s6.java
// TIJ4 Chapter Typeinfo, Exercise 6, page 561
/* Modify Shape1s.java so that it can "highlight" (set a flag in)
* all shapes of a particular type.  The toString() method for each 
* derived Shape1 should indicate whether that Shape1 is "highlighted."
*/
import java.util.*;

abstract class Shape1 {
	void draw() { System.out.println(this + ".draw()"); }
	abstract public String toString();
}

class Circle1 extends Shape1 {
	boolean flag = false;
	public String toString() { 
		return (flag ? "H" : "Unh") + "ighlighted " + "Circle1"; 
	}
}

class Square1 extends Shape1 {
	boolean flag = false;
	public String toString() { 
		return (flag ? "H" : "Unh") + "ighlighted " + "Square1"; 
	}
}

class Triangle1 extends Shape1 {
	boolean flag = false;
	public String toString() { 
		return (flag ? "H" : "Unh") + "ighlighted " + "Triangle1"; 
	}
}

public class Shapes6 {
	public static void setFlag(Shape1 s) {
			if(s instanceof Triangle1)
				((Triangle1)s).flag = true; 
		}			
	public static void main(String[] args) {
		// upcasting to Shape1:
		List<Shape1> shapeList = Arrays.asList(
			new Circle1(), new Square1(), new Triangle1()
		);
		for(Shape1 shape : shapeList) {
			setFlag(shape);
			System.out.println(shape);
		}
	}
}