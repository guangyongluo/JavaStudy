package thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test {

	
	public static void main(String[] args){
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		int i = 0;
		while(i < l1.size()){
			System.out.println(l1.get(i));
			i++;
		}
		ListIterator it = l1.listIterator();
		while(it.hasNext()){
			System.out.println("index : " + it.nextIndex() + " value : " + it.next());
		}
		
		System.out.println("next index : " + it.nextIndex() + " previous index : " + it.previousIndex());
		
		while(it.hasPrevious()){
			System.out.println("index : " + it.previousIndex() + " value : " + it.previous());
		}
		
	}
	
}
