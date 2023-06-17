package cgg.closure;

public class ClosureExample {

	public static void main(String[] args) {
		 int x=10;
		 int y=20;
//		 doOperate(x,new Operation() {
//		  @Override
//		  public void operate(int i) {
//			  System.out.println(i+y);
//		  }
//		 
//		 });
		 doOperate(x,i->{
			 //y=100;it gives error we can not change values of x and y
			 //preventing modification to the state of a function
			 System.out.println(i+y);
		 });
	}
    private static void doOperate(int i,Operation o) {
    	o.operate(i);
    }
}
