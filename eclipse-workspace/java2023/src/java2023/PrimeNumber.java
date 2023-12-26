package java2023;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 
   // A NUMBER IS PRIME IF (1) IT IS GREATER THAN 1  (2) HAS ONLY 2 FACTORS , 1 & ITSELF	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num % i == 0)
				{
					count++;
				}

			}
			if(count == 2)
			{
				System.out.println("It is a prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
		}
		else
		{
			System.out.println("Not a prime number");
		}

	}

}
