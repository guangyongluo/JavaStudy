package thinking.in.java.chapter15;
//: generics/CompilerIntelligence.java
import java.util.*;

public class CompilerIntelligence {
  public static void main(String[] args) {
    List<? extends Fruit> flist =
      Arrays.asList(new Apple());
    Apple a = (Apple)flist.get(0); // No warning
    System.out.println(flist.contains(a)); // Argument is 'Object'
    System.out.println(flist.indexOf(a)); // Argument is 'Object'
  }
} ///:~
