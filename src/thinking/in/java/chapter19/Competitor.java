//: enumerated/Competitor.java
// Switching one enum on another.
package thinking.in.java.chapter19;

public interface Competitor<T extends Competitor<T>> {
	Outcome compete(T competitor);
} /// :~
