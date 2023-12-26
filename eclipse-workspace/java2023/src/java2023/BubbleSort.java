package java2023;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = {4,40,1,5,3};
		int temp ;
		
		for (int k=0; k<a.length-1; k++)
		{
		for(int i=0; i<a.length-1; i++)     
		{
			if(a[i]>a[i+1])
			{
				temp = a[i];     
				a[i] = a[i+1];   
				a[i+1] = temp;   
			}
		}
		}
		
		for(int j=0; j<a.length; j++)
		{
			System.out.print(a[j]+" ");
		}	

	}

}
