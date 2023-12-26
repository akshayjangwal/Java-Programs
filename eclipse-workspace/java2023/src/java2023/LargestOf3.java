package java2023;

import java.util.Scanner;

public class LargestOf3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		
		
		if(b>a && b>c)
		{
			System.out.println(b+" is largest number");
		}
		else if (c>a && c>b)
		{
			System.out.println(c+" is largest number");
		}
		else
		{
			System.out.println(a+" is the largest number");
		}
		
		

	}

}
