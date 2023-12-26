package java2023;

import java.util.Scanner;

public class CountOddEvenDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		String str = Integer.toString(num);
		int even=0;
		int odd =0;
		
		for (int i=0; i<str.length(); i++)
		{
		if(str.charAt(i)%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
		}
		System.out.println("The number of even digits are : "+even);
		System.out.println("The number of odd digits are : "+odd);


	}

}
