package java2023;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		
		String str = "Java   Programming   Language Selenium      Automation";
		System.out.println("Before removing spaces : "+str);
		
		str = str.replaceAll("\\s", "");
		System.out.println("After removing spaces : "+str);
	}

}
