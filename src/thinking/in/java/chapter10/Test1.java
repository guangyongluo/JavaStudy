package thinking.in.java.chapter10;

import com.lwei.test.Inner;

public class Test1 {

	
	public void test(){
		Outer1 outer = new Outer1();
		Outer1.Inner inner = outer.makeInner();
		Inner in = new Inner();
	}
}
