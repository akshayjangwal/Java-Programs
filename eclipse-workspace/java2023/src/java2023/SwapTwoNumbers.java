package java2023;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		 
		int a = 10;
		int b = 20;
		System.out.println("First number is "+a);
		System.out.println("Second number is "+b);
		

		a = a+b; // ---> 10+20=30
		b = a-b;  //---> 30-20=10
		a = a-b; 
		
		System.out.println("a = "+a+" ..... b = "+b);
		

	}

}
