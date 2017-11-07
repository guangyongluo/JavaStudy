package thinking.in.java.chapter14;
// typeinfo/toys/Toy2Test19.java
// TIJ4 Chapter Typeinfo, Exercise 19, page 593
// In Toy2Test.java, use reflection to create a Toy2 object using
// the non-default constructor.
import static net.mindview.util.Print.*;
import java.lang.reflect.*;


class Toy2 {
	Toy2() {
		print("Creating Toy2() object");	
	}
	Toy2(int i) {
		print("Creating Toy2(" + i + ") object");
	}
}

class FancyToy2 extends Toy2 
	implements HasBatteries, Waterproof, Shoots {
		FancyToy2() { super(1); }
}

public class ToyTest19 {
	public static void main(String[] args) {
		// get appropriate constructor and create new instance:
		try {
			Toy2.class.getDeclaredConstructor(int.class).newInstance(1);
		// catch four exceptions:
		} catch(NoSuchMethodException e) {
			print("No such method: " + e);
		} catch(InstantiationException e) {
			print("Unable make Toy2: " + e);
		} catch(IllegalAccessException e) {
			print("Unable access: " + e);
		} catch(InvocationTargetException e) {
			print("Target invocation problem: " + e);
		}
	}
}