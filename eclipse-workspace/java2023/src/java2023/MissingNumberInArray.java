package java2023;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		// Conditions : Array should not have duplicates , Array does not need to be in sorted order , Values should be in range
		
		int a[] = {1,3,4,5};
		int sum1 = 0;
		int sum2 = 0;
		
		// sum 1 = 1+3+4+5 = 13
		// sum 2 = 1+2+3+4+5 = 15, so missing number is sum2-sum1 i.e. 2 in this case
		
		for(int i=0; i<a.length; i++)
		{
			sum1 = sum1 + a[i];
		}
		
		for (int j=1; j<=5; j++)
		{
			sum2 = sum2 + j;
		}
		int num = sum2-sum1;
		
		System.out.println("Missing number is: "+num);

	}

}
