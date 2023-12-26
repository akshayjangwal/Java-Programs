package java2023;

public class ReverseString {

	public static void main(String[] args) {


		String name = "AKSHAY";
		String temp = "";
		
		for(int i=name.length()-1; i>=0;i--)
		{
			temp = temp + name.charAt(i);
		}
		System.out.println("Reversed string is .... "+temp);
		

	}

}
