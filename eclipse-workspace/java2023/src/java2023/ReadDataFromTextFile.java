package java2023;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
//		APPROACH 1 : Using FileReader and BufferedReader class
		
/*		FileReader fr = new FileReader("C:\\Users\\aksha\\OneDrive\\Documents\\Automation Testing\\CORE JAVA\\Test.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close(); */
		
//APPROACH 2 : Using Scanner and File class
		
		File file = new File("C:\\Users\\aksha\\OneDrive\\Documents\\Automation Testing\\CORE JAVA\\Test.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}

	}

}
