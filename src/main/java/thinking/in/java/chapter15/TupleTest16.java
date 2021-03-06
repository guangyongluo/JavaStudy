package thinking.in.java.chapter15;

import static net.mindview.util.Tuple.tuple;

import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.SixTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

// generics/TupleTest16.java
// TIJ4 Chapter Generics, Exercise 16, page 641
// Add a SixTuple to Tuple.java and test it in TupleTest2.java.

public class TupleTest16 {
	static TwoTuple<String, Integer> f() {
		return tuple("hi", 47);
	}

	static TwoTuple f2() {
		return tuple("hi", 47);
	}

	static ThreeTuple<Amphibian, String, Integer> g() {
		return tuple(new Amphibian(), "hi", 47);
	}

	static FourTuple<Vehicle, Amphibian, String, Integer> h() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47);
	}

	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
	}

	// must use full name to distinguish from the SixTuple of Ex3:
	static SixTuple<Robot1, Vehicle, Amphibian, String, Integer, Double> m() {
		return tuple(new Robot1(), new Vehicle(), new Amphibian(), "hi", 47, 11.1);
	}

	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(f2());
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
		System.out.println(m());
	}
}