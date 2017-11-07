package thinking.in.java.chapter09;

public class TestInstance implements Test {

	public static void g() {
		System.out.println("static method g() in implement class");
	}

	public static void main(String[] args) {
		g();
		// f();
	}
}
