package thinking.in.java.chapter14;
// typeinfo/Shapes5.java
// TIJ4 Chapter Typeinfo, Exercise 5, page 561
/* Implement a rotate(Shape) method in Shapes.java, such that it checks
* to see if it is rotating a Circle (and, if so, doesn't perform the
* operation).
*/
import java.util.*;

public class Shapes5 {
	public static void rotate(Shape s) {
			if(!(s instanceof Circle))
				System.out.println(s + " rotate");
		}			
	public static void main(String[] args) {
		// upcasting to Shape:
		List<Shape> shapeList = Arrays.asList(
			new Circle(), new Square(), new Triangle(), new Rhomboid()
		);
		// downcasting back to specific shape:
		for(Shape shape : shapeList)
			shape.draw();	
		System.out.println();	
		for(Shape shape : shapeList)
			rotate(shape);
	}
}