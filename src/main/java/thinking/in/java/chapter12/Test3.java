package thinking.in.java.chapter12;

class AException2 extends Exception {  
}  

class BException2 extends AException2 {  
} 

class CException2 extends BException2 {  
}

abstract class Father3{
	public abstract void f() throws Exception;
}

public class Test3 extends Father3{
    public void f() throws AException2{
    }
}
