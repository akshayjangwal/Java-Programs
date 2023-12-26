package java2023;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {
		
		int a[] = {50,30,1,20,2000,40,60,99};
		
		int max = a[0];
		int min = a[0];
		
		for(int i=1; i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		for(int j=1; j<a.length;j++)
		{
			if(a[j]<min)
			{
				min = a[j];
			}
		}
		
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
	}

}
