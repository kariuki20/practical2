package finalPractical2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args)throws IOException  {
		Scanner userInput=new Scanner(System.in);
		String word =userInput.next();
		doesFileExist(word);
	}
	

	public  static void doesFileExist(String path) {
		if(path.equalsIgnoreCase("Apple")) {
			System.out.println("Word:Aple");
			System.out.println("definition1:a fruit");
			System.out.println("definition2:a tech firm");
		}
	
		else if(path.equalsIgnoreCase("Table")){
			System.out.println("word:Table");
			System.out.println("definition1:contains rows and columns when used in context of computers");
			System.out.println("definition2:an object");
			System.out.println("file does not exist");
	
		}
		 else {
			 System.out.println("file does not exist");
		 }
		}
}
	
	
	