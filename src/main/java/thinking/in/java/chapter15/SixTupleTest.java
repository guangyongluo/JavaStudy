package thinking.in.java.chapter15;

// generics/SixTupleTest.java
// TIJ4 Chapter Generics, Exercise 3, page 624
// Create and test a SixTuple generic.
import net.mindview.util.FiveTuple;

class Robot1 {
}

class Amphibian {
}

class Vehicle {
}

class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
	public final F sixth;

	public SixTuple(A a, B b, C c, D d, E e, F f) {
		super(a, b, c, d, e);
		sixth = f;
	}

	@Override
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " + fourth + ", " + fifth + ", " + sixth + ")";
	}
}

public class SixTupleTest {
	static SixTuple<Robot1, Vehicle, Amphibian, String, Integer, Double> f() {
		return new SixTuple<Robot1, Vehicle, Amphibian, String, Integer, Double>(new Robot1(), new Vehicle(),
				new Amphibian(), "hi", 47, 11.1);
	}

	public static void main(String[] args) {
		SixTuple<Robot1, Vehicle, Amphibian, String, Integer, Double> st = f();
		System.out.println(st);
		System.out.println(f());
	}
}