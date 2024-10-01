package day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			String[] ary = {"a","an","the","and","are","is"}; 
			Scanner scanner = new Scanner(new File("topic1/article1.txt"));
			//get all the content out
			String content = "";
			while(scanner.hasNextLine()) {	//if it has next line
				String line = scanner.nextLine();	//get next line
				content += line + "\n";
			}
			System.out.println(content);
			
			//remove all stop words -> new content
			//in the middle, in the beginning (of a sentence), in the end 
			for(String stop:ary) {
				content = content.replace(" "+stop+" ", " ");
			}
			
			System.out.println(content);
			//replace article with new content
			FileWriter writer = new FileWriter("topic1/article1.txt");
			writer.write(content);
			writer.close();		//if you don't close, then new content wouldn't be written
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
