package mypkg;

public class MyCalculator {
	public int sum(int a, int b ) {
		return a+b;
	}
	public int sub(int a, int b ) {
		return a-b;
	}
      public static void main(String[] args) {
    	  MyCalculator ob  = new MyCalculator();
    	  System.out.println("sum is: " +ob.sum(20,10));
    	  System.out.println("sub is: " +ob.sub(20,10));
    	  
    	  
      }
}
