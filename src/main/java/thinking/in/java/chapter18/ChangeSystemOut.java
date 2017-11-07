package thinking.in.java.chapter18;

//: io/ChangeSystemOut.java
// Turn System.out into a PrintWriter.
import java.io.PrintWriter;

public class ChangeSystemOut {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out, true);
		out.println("Hello, world");
	}
} /*
	 * Output: Hello, world
	 */// :~
