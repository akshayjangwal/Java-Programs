package java2023;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
/*		String a[] = {"java", "C", "C++", "java", "python", "C"};
		boolean flag=false;
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Found duplicate element : "+a[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate Element not found");
		}
		*/
		
		// APPROACH 2 : USING HASHSET - ONE OF THE COLLECTIONS IN JAVA THAT DOES NOT ALLOW TO STORE DUPLICATE ELEMENTS
		
		String a[] = {"java", "C", "C++", "java", "python", "C"};
		HashSet <String> hs = new HashSet();
		
		boolean flag=false;
		
		for (String l:a)  //From a[] array, it reads each & every value one after another, each value will be stored inside string variable l. hs is a HashSet variable which should not allow the duplicates. If we add duplicates, it will return false.
		{
//		     System.out.println(hs.add(l));
		     if(hs.add(l)==false)
		     {
		    	 System.out.println("Found duplicate element : "+ l);
		    	 flag=true;
		     }
		}
		
		if (flag==false)
		{
			System.out.println("No duplicate elements found");
		}
		
		
		
		
		
		

		
		


	}

}

