package thinking.in.java.chapter05;

public class ReturnValue {

	private int a;
	private String b;
	
	private static void returnValue(){
		return;
	}
	
	public ReturnValue(int x){
		this.a = x;
	}
	
	public ReturnValue(String y){
		this.b = y;
	}
	
	public ReturnValue(int x, String y){
		this(x);
		//this(y);
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
