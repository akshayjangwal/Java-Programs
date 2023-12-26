package java2023;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		
		
//		APPROACH 1 : LOGIC
		
/*		String str = "Welcome to Java and Selenium";
		String reverse_str ="";
		String arr [] = str.split(" ");   //Split given string into words
		
		for(int i=0; i<arr.length;i++)		//Take each word and reverse it
		{
			String word = arr[i];
		    String reverse_word="";
		    
		    for(int j=word.length()-1; j>=0; j--)   //Adding reversed word to reverse string
		    {
		    	reverse_word = reverse_word+word.charAt(j);
		    }
		    System.out.print(reverse_str + reverse_word + " " );
		} */
		
//      APPROACH 2 : Using built-in method via STRING BUILDER class	
		
		String str = "Welcome to Java";
		String arr[] = str.split(" ");
		String reverse_word = "";
		
		for(String w:arr)   // Pick each word from arr, store it in w
		{
		
		StringBuilder sb = new StringBuilder(w);
		sb.reverse();   
		reverse_word = reverse_word + sb.toString()+" ";
		
		}
		System.out.println(reverse_word);	
		
	}

}
