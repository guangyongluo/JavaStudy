package thinking.in.java.chapter18;

//: io/E13_CountLines.java
/****************** Exercise 13 *****************
* Modify BasicFileOutput.java so that it uses
* LineNumberReader to keep track of the line
* count. Note that it’s much easier to just keep
* track programmatically.
***********************************************/

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class E13_CountLines {
	static String file = "E13_CountLines.out";

	public static void main(String[] args) throws IOException {
		// LineNumberReader is inherited from
		// BufferedReader so we don't need to
		// explicitly buffer it:
		LineNumberReader in = new LineNumberReader(
				new FileReader("src/thinking/in/java/chapter18/E13_CountLines.java"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		String s;
		while ((s = in.readLine()) != null)
			out.println(in.getLineNumber() + ": " + s);
		out.close();
		// Show the stored file:
		System.out.println(E07_FileIntoList.read(file));
	}
}
