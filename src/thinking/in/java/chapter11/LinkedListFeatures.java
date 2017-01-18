package thinking.in.java.chapter11;
//: holding/LinkedListFeatures.java
import java.util.*;

public class LinkedListFeatures {
  public static void main(String[] args) {
    LinkedList<Integer> pets =
      new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
    System.out.println(pets);
    // Identical:
    System.out.println("pets.getFirst(): " + pets.getFirst());
    System.out.println("pets.element(): " + pets.element());
    // Only differs in empty-list behavior:
    System.out.println("pets.peek(): " + pets.peek());
    // Identical; remove and return the first element:
    System.out.println("pets.remove(): " + pets.remove());
    System.out.println("pets.removeFirst(): " + pets.removeFirst());
    // Only differs in empty-list behavior:
    System.out.println("pets.poll(): " + pets.poll());
    System.out.println(pets);
    pets.addFirst(1);
    System.out.println("After addFirst(): " + pets);
    pets.offer(6);
    System.out.println("After offer(): " + pets);
    pets.add(7);
    System.out.println("After add(): " + pets);
    pets.addLast(8);
    System.out.println("After addLast(): " + pets);
    System.out.println("pets.removeLast(): " + pets.removeLast());
  }
} /* Output:
[Rat, Manx, Cymric, Mutt, Pug]
pets.getFirst(): Rat
pets.element(): Rat
pets.peek(): Rat
pets.remove(): Rat
pets.removeFirst(): Manx
pets.poll(): Cymric
[Mutt, Pug]
After addFirst(): [Rat, Mutt, Pug]
After offer(): [Rat, Mutt, Pug, Cymric]
After add(): [Rat, Mutt, Pug, Cymric, Pug]
After addLast(): [Rat, Mutt, Pug, Cymric, Pug, Hamster]
pets.removeLast(): Hamster
*///:~
