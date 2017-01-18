package thinking.in.java.chapter06;

public class TestAccess {
	
	private int a = 0;
	protected int b = 0;
	public int c = 0;

    private int f1(int var){
    	a = var;
    	return a;
    }
    
    protected int f2(int var){
    	b = var;
    	return b;
    }
    
    public int f3(int var){
    	c = var;
    	return c;
    }
}
