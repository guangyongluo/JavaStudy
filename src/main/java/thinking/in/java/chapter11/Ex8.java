package thinking.in.java.chapter11;
// holding/Ex8.java
// TIJ4 Chapter Holding, Exercise 8, page 409
// Modify Exercise 1 so it uses an Iterator to move through the List while 
// calling hop().
import java.util.*;

class Gerbil1 {
	private int gerbilNumber;
	public Gerbil1(int i) {
		gerbilNumber = i;
	}
	public void hop() {
		System.out.println("Gerbil1 " + gerbilNumber + " hops");
	}
}

public class Ex8 {
	public static void main(String[] args) {
		ArrayList<Gerbil1> gerbils = new ArrayList<Gerbil1>();
		for(int i = 0; i < 10; i++)
			gerbils.add(new Gerbil1(i));
		Iterator<Gerbil1> it = gerbils.iterator();
		while(it.hasNext()) 
			it.next().hop();
	}
}


