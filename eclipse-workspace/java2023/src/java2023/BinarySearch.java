package java2023;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};     
		// Pre-requisite : Elements should be in sorted order
		// Split the array in 2 equal parts based upon the mid value
		
		//Approach 1 : Logic
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number you want to search : ");
		int key = sc.nextInt();
		
		int l=0;
		int h = a.length-1;
		
		boolean flag = false;
		
		while(l<=h)
		{
			
			int mid = (l+h)/2;
			
			if(key == a[mid])
			{
				System.out.println("Element found . . .");
				flag = true;
				break;
			}
			
			if(key>a[mid])
			{
				l=mid+1;
			}
		     if(key<a[mid])
			{
				h=mid-1;
			}
						
		}
		
		if(flag == false)
		{
			System.out.println("Element not found . . . ");
		} 

		
/*		Approach 2 :  Using built in function Arrays.binarySearch(). It returns index number where exactly element is present in array
			
			System.out.println(Arrays.binarySearch(a, 8)); 
			*/
	}
}
