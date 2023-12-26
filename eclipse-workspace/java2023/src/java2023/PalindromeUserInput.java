package java2023;

import java.util.Scanner;

public class PalindromeUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);    // ---> Create a Scanner object
		System.out.println("Enter the number : ");
		String num = sc.nextLine();   // -------> Read user input
		
		System.out.println("The entered number is : "+num);  // -----> Output user input
		String temp="";
		
		 for(int i=num.length()-1; i>=0; i--)
		 {
			 temp = temp + num.charAt(i);
		 }
		 System.out.println("The revered number is : "+temp);
		 
		 if(temp.equalsIgnoreCase(num))
		 {
			 System.out.println("Given number is a palindrome");
		 }
		 else
		 {
			 System.out.println("Given number is not a palindrome");
		 }
		

	}

}
