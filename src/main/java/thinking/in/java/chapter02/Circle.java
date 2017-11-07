package thinking.in.java.chapter02;

public class Circle {
    private double radius = 0;
	public static int count =1;
    
    public Circle(double radius) {
        this.radius = radius;
    }
     
    class Draw {     //�ڲ���
    	public void increment(){
    		count++;
    	}
    	
        public void drawSahpe() {
            System.out.println(radius);  //�ⲿ���private��Ա
            System.out.println(count);   //�ⲿ��ľ�̬��Ա
        }
    }
	
    public static void main(String arg[]){
    	Circle circle = new Circle(100);
    	
    	Circle.Draw draw = circle.new Draw();
    	draw.increment();
    	draw.drawSahpe();
    }
}
