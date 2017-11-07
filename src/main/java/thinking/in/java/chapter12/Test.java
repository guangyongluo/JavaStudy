package thinking.in.java.chapter12;

//public class Test extends Father implements MyInterface {//Exception AException in throws clause of Father.methodA() is not compatible with MyInterface.methodA()  
//}  
  
class AException extends Exception {  
}  
  
class BException extends Exception {  
}  
  
abstract class Father {  
    public void methodA() throws AException {  
    }  
  
    public void methodB() {  
    }  
}  
  
interface MyInterface {  
    public void methodA() throws BException;  
  
    public void methodB();  
}  
