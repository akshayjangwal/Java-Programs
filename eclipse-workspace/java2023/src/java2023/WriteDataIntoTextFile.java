package java2023;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
	
//		Using FileWriter and BufferedWriter class
		
		
		FileWriter fw = new FileWriter("C:\\Users\\aksha\\OneDrive\\Documents\\Automation Testing\\CORE JAVA\\Test123.txt");
		//It will create a new file named Test123.txt at the specified path
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Welcome to Java");
		bw.newLine();
		bw.write("Welcome to Selenium");
		bw.newLine();
		bw.write("Welcome to QA Automation");
		
		System.out.println("Finished . . . ");
		
		bw.close();

	}

}
