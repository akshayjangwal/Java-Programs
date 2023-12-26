package java2023;


import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the number : "); String num = sc.nextLine(); int
		 * temp =0;
		 * 
		 * for(int i = num.length()-1; i>=0;i--) { int a = num.charAt(i); if(a>=0) {
		 * temp=temp+1; }
		 * 
		 * } System.out.println("Number of digits are : "+temp);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		
		while(num>0)
		{
			num=num/10;  //-> eliminate the last digit in the number and store it in the same number
			count++;
		}
		
		System.out.println("Number of digits are : "+count);
		
		
}
		


	}


