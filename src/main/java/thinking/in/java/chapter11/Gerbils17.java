package thinking.in.java.chapter11;
// holding/Gerbil2s17.java
// TIJ4 Chapter Holding, Exercise 17, page 422
/* Take the Gerbil2 class in Exercise 1 and put it into a Map instead, 
* associating each Gerbil2's name (e.g. "Fuzzy" or "Spot") as a String (the
* key) for each Gerbil2 (the value) you put in the table. Get an Iterator for
* the keySet() and use it to move through the Map, looking up the Gerbil2 for
* each key and printing out the key and telling the Gerbil2 to hop().
*/
import java.util.*;

class Gerbil2 {
	private int gerbilNumber;
	public Gerbil2(int i) {
		gerbilNumber = i;
	}
	public void hop() {
		System.out.println("gerbil " + gerbilNumber + " hops");
	}
}

public class Gerbils17 {
	public static void main(String[] args) {
		Map<String, Gerbil2> gerbils = new HashMap<String, Gerbil2>();
		gerbils.put("Fuzzy", new Gerbil2(0));
		gerbils.put("Spot", new Gerbil2(1));
		gerbils.put("Speedy", new Gerbil2(2));
		gerbils.put("Dopey", new Gerbil2(3));
		gerbils.put("Sleepy", new Gerbil2(4));
		gerbils.put("Happy", new Gerbil2(5));
		Iterator<String> it = gerbils.keySet().iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + ": ");
			gerbils.get(s).hop();
		}	
	}
}

