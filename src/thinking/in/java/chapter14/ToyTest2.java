package thinking.in.java.chapter14;
//typeinfo/toys/Toy1Test2.java
// TIJ4 Chapter Typeinfo, Exercise 2, page 561
// Incorporate a new kind of interface into Toy1Test.java and 
// verify that it is detected and displayed properly.
import static net.mindview.util.Print.*;

interface Flies {}

class Toy1 {
	// Comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
	Toy1() {}
	Toy1(int i) {}
}

class FancyToy1 extends Toy1 
	implements HasBatteries, Waterproof, Shoots, Flies {
		FancyToy1() { super(1); }
}

public class ToyTest2 {
	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() +
			" is interface? [" + cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name: " + cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("thinking.in.java.chapter14.FancyToy1");
		} catch(ClassNotFoundException e) {
			print("Can't find FancyToy1");
			System.exit(1);
		}
		printInfo(c);
		for(Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			// Requires default constructor:
			obj = up.newInstance();
		} catch(InstantiationException e) {
			print("Cannot instantiate");
			System.exit(1);
		} catch(IllegalAccessException i) {
			print("Cannot access");
			System.exit(1);
		}	
		printInfo(obj.getClass());
	}
}