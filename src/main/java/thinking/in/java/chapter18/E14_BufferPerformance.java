package thinking.in.java.chapter18;

//: io/E14_BufferPerformance.java
/****************** Exercise 14 *****************
* Starting with BasicFileOutput.java, write a
* program that compares the performance of writing
* to a file when using buffered and unbuffered I/O.
***********************************************/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class E14_BufferPerformance {
	static String file = "E14_BufferPerformance.out";

	public static void main(String[] args) throws IOException {
		List<String> list = E07_FileIntoList.read("src/thinking/in/java/chapter18/E14_BufferPerformance.java");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		long t1 = System.currentTimeMillis();
		for (String s : list) {
			for (int i = 0; i < 10000; i++)
				out.println(lineCount + ": " + s);
			lineCount++;
		}
		long t2 = System.currentTimeMillis();
		System.out.println("buffered: " + (t2 - t1));
		out.close();
		out = new PrintWriter(new FileWriter(file));
		lineCount = 1;
		t1 = System.currentTimeMillis();
		for (String s : list) {
			for (int i = 0; i < 10000; i++)
				out.println(lineCount + ": " + s);
			lineCount++;
		}
		t2 = System.currentTimeMillis();
		System.out.println("unbuffered: " + (t2 - t1));
		out.close();
	}
}