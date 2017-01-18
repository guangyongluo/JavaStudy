package thinking.in.java.chapter08;


class Root{
	public Root(){}
	public void test(){
		System.out.println("test() in class Root");
	}
}

class Leaf1 extends Root{
	public Leaf1(){}
	public void test(){
		System.out.println("test() in class Leaf1");
	}
}

class Leaf2 extends Root{
	public Leaf2(){}
	public void test(){
		System.out.println("test() in class Leaf2");
	}
}

public class A {
    public final static void method(Root root){
    	root.test();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Leaf1 L1 = new Leaf1();
        Leaf2 L2 = new Leaf2();
        method(L1);
        method(L2);
	}

}
