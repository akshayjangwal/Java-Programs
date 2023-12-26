package java2023;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int last_dig;
		
		while (num>0)
		{
		last_dig = num % 10;
		num = num / 10;
		sum = sum + last_dig;
		}
		

		System.out.println("Sum of all the digits is : "+sum);
		

	}

}
