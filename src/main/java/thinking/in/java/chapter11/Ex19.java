package thinking.in.java.chapter11;
// holding/Ex19.java
// TIJ4 Chapter Holding, Exercise 19, page 422
// Repeat the previous exercise with a HashSet and a LinkedHashSet.
import java.util.*;

class Gerbil4 {
	private int gerbilNumber;
	public Gerbil4(int i) {
		gerbilNumber = i;
	}
	public void hop() {
		System.out.println("gerbil " + gerbilNumber + " hops");
	}
}

public class Ex19 {
	public static void main(String[] args) {
		Map<String, Gerbil4> gerbils = new HashMap<String, Gerbil4>();
		gerbils.put("Fuzzy", new Gerbil4(0));
		gerbils.put("Spot", new Gerbil4(1));
		gerbils.put("Speedy", new Gerbil4(2));
		gerbils.put("Dopey", new Gerbil4(3));
		gerbils.put("Sleepy", new Gerbil4(4));
		gerbils.put("Happy", new Gerbil4(5));
		gerbils.put("Funny", new Gerbil4(6));
		gerbils.put("Silly", new Gerbil4(7));
		gerbils.put("Goofy", new Gerbil4(8));
		gerbils.put("Wowee", new Gerbil4(9));
		System.out.println(gerbils);
		System.out.println();
		Set<String> hashedKeys = 
			new HashSet<String>(gerbils.keySet());
		System.out.println("HashSet: " + hashedKeys);
		System.out.println();
		Map<String, Gerbil4> hashedGerbil4s = 
			new LinkedHashMap<String, Gerbil4>();
		for(String s : hashedKeys) {
			System.out.print("Adding " + s + ", ");			
			hashedGerbil4s.put(s, gerbils.get(s));
		}
		System.out.println();
		System.out.println();
		System.out.println("From HashSet: " + hashedGerbil4s);
		
		System.out.println();
		Set<String> linkedHashedKeys = 
			new LinkedHashSet<String>(gerbils.keySet());
		System.out.println("LinkedHashSet: " + linkedHashedKeys);
		System.out.println();
		Map<String, Gerbil4> linkedHashedGerbil4s = 
			new LinkedHashMap<String, Gerbil4>();
		for(String s : linkedHashedKeys) {
			System.out.print("Adding " + s + ", ");			
			linkedHashedGerbil4s.put(s, gerbils.get(s));
		}
		System.out.println();
		System.out.println();
		System.out.println("From LinkedHashSet: " 
			+ linkedHashedGerbil4s);
		}
}

