package day3;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//System   Scanner
		System.out.println("normal text");
		int a = 8;
		System.out.println(a);
		System.out.println("normal text to concat a variable a, a="+a);
		int b = 5;
		//a=8,b=5
		System.out.println("a="+a+",b="+b);
		
//		Scanner scanner = new Scanner(System.in);
//		DataType variableName = value;
		int x = 10;
		String y = "hello";
		boolean z = true;
		Scanner scanner = new Scanner(System.in);  //new->create  ,System.in : input device of your system
		System.out.println("please enter an integer number:");
		int number = scanner.nextInt();//allow user to enter an integer number
		System.out.println("the number you just entered is "+number);
	}

}

