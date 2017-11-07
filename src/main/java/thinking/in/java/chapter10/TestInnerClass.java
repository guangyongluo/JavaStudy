package thinking.in.java.chapter10;

interface A8{
	int value();
	String outterValue(String s);
	void print();
}

public class TestInnerClass {
	private String s;
	
    private A8 f(String a){
    	return new A8(){
    		private int i;
    		private String s = a;
    		public int value(){
    		    return i;
    		}
    		public String outterValue(String s1){
    			return s1;
    		}
    		public void print(){
    			System.out.println(s);
    		}
    	};
    }
	public static void main(String args[]){
		String s = "hello, world!";
		String ss = "HELLO, WORLD!";
		TestInnerClass test = new TestInnerClass();
		A8 a = test.f(ss);
		System.out.println(a.outterValue(s));
		a.print();
	}
}
