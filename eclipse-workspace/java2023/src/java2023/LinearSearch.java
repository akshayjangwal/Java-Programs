package java2023;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {10,20,40,30,50};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = false;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Element found at index "+i);
				flag=true;
				break;
				
			}
			
		}
		if(flag==false)
		{
		System.out.println("Element not found");
		}

	}

}
