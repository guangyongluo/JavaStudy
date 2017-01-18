package thinking.in.java.chapter09;
//: interfaces/filters/Waveform.java

public class Waveform {
  private static long counter;
  private final long id = counter++;
  public String toString() { return "Waveform " + id; }
} ///:~
