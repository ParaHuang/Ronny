package day6;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//input validation(if statement)
		//Math class
		//case switch
		//while statements
		//overloading
		
		Scanner scanner = new Scanner(System.in);
		//confirm input by enter or space
		/*
		//String
		scanner.next();
		scanner.nextLine();//only confirm by enter
		//int
		scanner.nextInt();
		//double
		scanner.nextDouble();
		*/
		if(scanner.hasNextInt()) {//see if you just input an integer number
			int x = scanner.nextInt();
			System.out.println("you just input "+x);
		}else {
			System.out.println("sorry,what you input is not an integer number");
		}

//		double y = scanner.nextDouble();
//		String z = scanner.next();
//		System.out.println(y);
//		System.out.println(z);
//		String line = scanner.nextLine();
//		System.out.println(line);
	}

}
















