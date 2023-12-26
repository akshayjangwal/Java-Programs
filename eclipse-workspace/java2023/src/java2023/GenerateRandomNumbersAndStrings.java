package java2023;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		
		// 1. Using Random Class in java - Generate random integers
		
		Random rand = new Random();
		int rand_int = rand.nextInt(100);  //---> 100 means that it will pick any number between 0 to 99, if we give 10 then it will randomly generate between 0 to 9.
		System.out.println(rand_int);
		
		// Generate random decimal numbers
		
		double rand_double = rand.nextDouble();  // range 0.0 and less than 1.0
		System.out.println(rand_double);
		
		// 2. Using Apache commons-lang API -- To generate random numbers and random strings

		
		
	}

}
