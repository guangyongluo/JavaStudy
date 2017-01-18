package thinking.in.java.chapter11;
// holding/Ex6.java
// TIJ4 Chapter Holding, Exercise 6, page 406
/* Modify listFeatures.java so that it uses String instead of Pets, 
* and explain any difference in results.
*/
import java.util.*;

public class Ex6 {
	public static void main(String[] args) {
		Random rand = new Random();
		List<String> ls = new ArrayList<String>();
		System.out.println("0: " + ls);
		Collections.addAll(ls, "oh", "what", "a", "beautiful", "Manila", "Monday", "morning");
		System.out.println("1: " + ls);
		String h = new String("hi");
		ls.add(h);
		System.out.println("2: " + ls);
		System.out.println("3: " + ls.contains(h));
		// removes the first instance equivalent to String h:
		ls.remove(h);
		System.out.println("3.5: " + ls);
		String p = ls.size() > 2 ? ls.get(2) : null;
		System.out.println("4: " + p + " " +  ls.indexOf(p));
		String cy = new String("cy");
		System.out.println("5: " + cy +" " + ls.indexOf(cy));
		System.out.println("6: " + ls.remove(cy));
		System.out.println("7: " + ls.remove(p));
		System.out.println("8: " + ls);
		if(ls.size() > 3)
			ls.add(3, "wonderful");
		System.out.println("9: " + ls);
		if(ls.size() < 4) {
			List<String> s = 
			   Arrays.asList("let's", "jump", "in", "here");
			ls.addAll(0, s);
		}
		List<String> sub = ls.subList(1, 4);
		System.out.println("sublist: " + sub);
		System.out.println("10: " + ls.containsAll(sub));
		// will also sort sub elements within ls:
		Collections.sort(sub);
		System.out.println("sorted sublist: " + sub);
		System.out.println("11: " + ls.containsAll(sub));
		System.out.println("11.25: " + ls);
		// will also shuffle sub elements within ls:
		Collections.shuffle(sub, rand);
		System.out.println("11.5: " + ls);
		System.out.println("shuffled sublist: " + sub);
		System.out.println("12: " + ls.containsAll(sub));
		List<String> copy = new ArrayList<String>(ls);
		System.out.println("12.5: " + ls);
		if(ls.size() < 5) {
			ls.add("two");
			ls.add("more");
		}
		sub = Arrays.asList(ls.get(1), ls.get(4));
		System.out.println("sub: " + sub);	
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<String>(ls);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub); 
		System.out.println("15: " + copy);
		if(copy.size() > 1) // to avoid out of bounds exception
			copy.set(1, "excellent"); 
		System.out.println("16: " + copy);
		if(copy.size() > 2)
			copy.addAll(2, sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + ls.isEmpty());
		ls.clear();
		System.out.println("19: " + ls);
		System.out.println("20: " + ls.isEmpty());
		ls.addAll(0, sub);
		ls.addAll(2, sub);
		System.out.println("21: " + ls);
		Object[] o = ls.toArray();
		System.out.println("22: " + o[3]);
		String[] sa = ls.toArray(new String[0]);
		System.out.println("23: " + sa[3]);
	}
}