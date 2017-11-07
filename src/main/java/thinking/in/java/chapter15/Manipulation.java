package thinking.in.java.chapter15;
//: generics/Manipulation.java

// {CompileTimeError} (Won't compile)

class Manipulator<T extends HasF> {
	private T obj;

	public Manipulator(T x) {
		obj = x;
	}

	// Error: cannot find symbol: method f():
	public void manipulate() {
		obj.f();
	}
}

public class Manipulation {
	public static void main(String[] args) {
		HasF hf = new HasF();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
		manipulator.manipulate();
	}
} /// :~
