package java2023;

public class RemoveJunk {

	public static void main(String[] args) {
		
//		Using replaceAll method - takes two parameters : 1. Regular expression 2. Replacement String
		
		String a = "@&*^&#$@!() Hello World 24-12-2023";
		
		a = a.replaceAll("[^a-zA-Z0-9]", "");  
//		means keep only characters and numbers from a-zA-Z0-9 in the string, ^ operator shows that remove everything else other than a-zA-Z0-9 and replace it with no space i.e. "" mentioned in replacement parameter
//		now store this string in a new variable
		
		System.out.println(a);
		

	}

}
