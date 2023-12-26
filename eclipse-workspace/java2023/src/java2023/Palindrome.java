package java2023;

public class Palindrome {

	public static void main(String[] args) {
		 int num = 16461;
		 String temp = "";
		 
		 String str = Integer.toString(num);
		 
		 for(int i=str.length()-1; i>=0; i--)
		 {
			 temp = temp + str.charAt(i);
		 }
		 System.out.println(temp);
		 
		 if(temp.equalsIgnoreCase(str))
		 {
			 System.out.println("Given number is a palindrome");
		 }
		 else
		 {
			 System.out.println("Given number is not a palindrome");
		 }
		 

	}

}
