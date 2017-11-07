package thinking.in.java.chapter07;
// reusing/Scarab.java
// TIJ4 Chapter Reusing, Exercise 24, page 274
/* In Beetle.java, inherit a specific type beetle from class Beetle, following
* the same format as the existing classes. Trace and expain the output.
*/

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		System.out.print("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.print(s);
		return 47;
	}
}

class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
		System.out.print("k = " + k);
		System.out.print("j = " + j);
	}
	private static int x2 = printInit("static Beetle.x2 initialized");	
}

public class Scarab extends Beetle {
	private int n = printInit("Scarab.n initialized");
	public Scarab() {
		System.out.print("n = " + n);
		System.out.print("j = " + j);
	}
	private static int x3 = printInit("static Scarab.x3 initialized");
	public static void main(String[] args) {
		System.out.print("Scarab constructor");
		Scarab sc = new Scarab();			
	}
}
