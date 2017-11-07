package thinking.in.java.chapter09;
//: interfaces/interfaceprocessor/Apply.java

public class Apply {
  public static void process(Processor p, Object s) {
    System.out.println("Using Processor " + p.name());
    System.out.println(p.process(s));
  }
} ///:~
