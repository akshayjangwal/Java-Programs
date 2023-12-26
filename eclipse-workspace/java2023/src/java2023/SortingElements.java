package java2023;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		
//		int a[] = {20,50,10,30,40};
		
//		*** Approach 1 ***
		
/*		System.out.println("Array before sorting :"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array after sorting :"+Arrays.toString(a)); */
		
//		*** Approach 2 ***
		
/*		System.out.println("Array before sorting :"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting :"+Arrays.toString(a)); */
		
//		*** Approach 3 *** - Descending order
		
		Integer a[] = {20,50,10,30,40};
		
		System.out.println("Array before sorting :"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting :"+Arrays.toString(a)); 
		
		
		
		
		

	}

}
