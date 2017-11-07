package thinking.in.java.chapter12;

public class Test1 extends Father1 {  
	  
    public Test1() throws Exception {//��ͬ�ĵط�  
        super();  
        // TODO Auto-generated constructor stub  
    }  
}  
  
abstract class Father1 {  
    public Father1() throws AException1 {  
    }  
}

abstract class Father2{
	public Father2() throws BException1 {
	}
}
  
class AException1 extends Exception {  
}  

class BException1 extends Exception {  
} 
