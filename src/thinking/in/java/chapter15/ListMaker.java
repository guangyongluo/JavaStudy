package thinking.in.java.chapter15;

//: generics/ListMaker.java
import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {
	List<T> create() {
		return new ArrayList();
	}

	public static void main(String[] args) {
		ListMaker<String> stringMaker = new ListMaker<String>();
		List<String> stringList = stringMaker.create();
		stringList.add("123456");
		// stringList.add(true);
		stringList.add("test");
		System.out.println(stringList);
	}
} /// :~
