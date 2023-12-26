package java2023;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		
		
		String s = "Java Programming Java OOPS";
		
		//Count how many times character 'a' is coming up in the string s
		
		int len1 = s.length();     //Total length of the string
		int len2 = s.replace("a","" ).length();   //Length of the string after removing character 'a'
		int count = len1 - len2;
		
		System.out.println("Occurence of character a in the string is : "+count+" times");
		

	}

}
