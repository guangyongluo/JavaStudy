package thinking.in.java.chapter18;

//: io/OSExecuteDemo.java
// Demonstrates standard I/O redirection.
import net.mindview.util.OSExecute;

public class OSExecuteDemo {
	public static void main(String[] args) {
		OSExecute.command("javap bin/thinking/in/java/chapter18/OSExecuteDemo");
	}
} /*
	 * Output: Compiled from "OSExecuteDemo.java" public class OSExecuteDemo
	 * extends java.lang.Object{ public OSExecuteDemo(); public static void
	 * main(java.lang.String[]); }
	 */// :~
