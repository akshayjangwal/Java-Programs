package java2023;

import java.util.Arrays;

public class CheckArraysEqual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
/*		int count=0;
		int len=a.length;
		
		if(a.length == b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==b[i])
				{
					count++;
				}
				else if(a[i]!=b[i])
				{
					count=0;
				}
			}
			
			if (count == len)
			{
				System.out.println("Arrays are EQUAL");
			}
			else
			{
				System.out.println("Arrays are NOT EQUAL");
			}
			
		}
		else
		{
			System.out.println("Arrays are NOT EQUAL");
		}*/
		
// APPROACH 2 - Using Arrays class

		
		boolean status = Arrays.equals(a, b);
		if(status == true)
		{
			System.out.println("Arrays are EQUAL");
		}
		else
		{
			System.out.println("Arrays are NOT EQUAL");
		}

		


	}

}
