//: annotations/database/Uniqueness.java
// Sample of nested annotations
package thinking.in.java.chapter20;

public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique = true);
} /// :~
