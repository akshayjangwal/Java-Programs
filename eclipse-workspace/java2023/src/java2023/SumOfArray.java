package java2023;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		

		int arr[] = {1,2,3,4,5,6};
		int sum = 0;
		
		for(int i=arr.length-1; i>=0;i--)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("The sum is : "+sum);

	}

}
