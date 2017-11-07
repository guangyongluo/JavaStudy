package thinking.in.java.chapter18;

import java.util.ArrayList;

//: xml/People.java
// {Requires: nu.xom.Node; You must install
// the XOM library from http://www.xom.nu }
// {RunFirst: Person}
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Elements;

public class People extends ArrayList<Person> {
	public People(String fileName) throws Exception {
		Document doc = new Builder().build(fileName);
		Elements elements = doc.getRootElement().getChildElements();
		for (int i = 0; i < elements.size(); i++)
			add(new Person(elements.get(i)));
	}

	public static void main(String[] args) throws Exception {
		People p = new People("People.xml");
		System.out.println(p);
	}
} /*
	 * Output: [Dr. Bunsen Honeydew, Gonzo The Great, Phillip J. Fry]
	 */// :~
