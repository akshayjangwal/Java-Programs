package java2023;

public class FibonacciSeries {

	public static void main(String[] args) {
		
//		0 1 1 2 3 5 8 13 21 34 55 . .
		
		int n1 = 0;
		int n2 = 1;
		int sum;
		
		System.out.print(n1+"  "+n2+"  ");  // 0  1
		
		for (int i=3; i<12; i++)   
		{
			sum = n1 + n2;  // 1 , 1+1=2,  , 1+2=3, 2+3=5 . . . 
			n1 = n2;        // 1 , 1 , 2 , 3 . . .
			n2 = sum;       // 1 , 2 , 3 , 5 . . .
			
			System.out.print(n2+"  ");
		}	

	}

}
