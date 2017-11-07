package thinking.in.java.chapter11;
// holding/Ex18.java
// TIJ4 Chapter Holding, Exercise 18, page 422
/* Fill a HashMap with key-value pairs. Print the results to show ordering
* by hash code. Extract the pairs, sort by key, and place the result into a 
* LinkedHashMap. Show that the insertion order is maintained. 
*/
import java.util.*;

class Gerbil3 {
	private int gerbilNumber;
	public Gerbil3(int i) {
		gerbilNumber = i;
	}
	public void hop() {
		System.out.println("gerbil " + gerbilNumber + " hops");
	}
}

public class Ex18 {
	public static void main(String[] args) {
		Map<String, Gerbil3> gerbils = new HashMap<String, Gerbil3>();
		gerbils.put("Fuzzy", new Gerbil3(0));
		gerbils.put("Spot", new Gerbil3(1));
		gerbils.put("Speedy", new Gerbil3(2));
		gerbils.put("Dopey", new Gerbil3(3));
		gerbils.put("Sleepy", new Gerbil3(4));
		gerbils.put("Happy", new Gerbil3(5));
		gerbils.put("Funny", new Gerbil3(6));
		gerbils.put("Silly", new Gerbil3(7));
		gerbils.put("Goofy", new Gerbil3(8));
		gerbils.put("Wowee", new Gerbil3(9));
		System.out.println(gerbils);
		System.out.println();
		Set<String> sortedKeys = 
			new TreeSet<String>(gerbils.keySet());
		System.out.println(sortedKeys);
		System.out.println();
		Map<String, Gerbil3> sortedGerbil3s = 
			new LinkedHashMap<String, Gerbil3>();
		for(String s : sortedKeys) {
			System.out.print("Adding " + s + ", ");
			sortedGerbil3s.put(s, gerbils.get(s));			
		}
		System.out.println();
		System.out.println();
		System.out.println(sortedGerbil3s);
		System.out.println();
		// or, just:
		Map<String, Gerbil3> sortedGerbil3s2 =
			new TreeMap<String, Gerbil3>(gerbils);
		System.out.println(sortedGerbil3s2);		
	}
}

