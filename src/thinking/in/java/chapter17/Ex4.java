package thinking.in.java.chapter17;
// containers/Ex4.java
// TIJ4 Chapter Containers, Exercise 4, page 809
/* Create a Collection initializer that opens a file and breaks
* it into words using TextFile, and then uses the words as the
* source of data for the resulting Collection. Demonstrate that 
* it works.
*/
import java.util.*;
import net.mindview.util.*;

public class Ex4 {
	static Collection<String> CollectFromText(String fileName) {		
		String[] sa = TextFile.read(fileName).split(" ");
		return Arrays.asList(sa);
	}
	static Collection<String> CollectFromText2(String fileName) {		
		//String[] sa = TextFile.read(fileName).split(" ");
		return new TreeSet<String>(new TextFile(fileName, "\\W+"));
	}
	public static void main(String[] args) {
		System.out.println(CollectFromText("src/thinking/in/java/chapter17/Ex4.java"));
		System.out.println(CollectFromText2("src/thinking/in/java/chapter17/Ex4.java"));
	}
}