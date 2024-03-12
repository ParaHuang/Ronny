package day4;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String y = "hello";
		int x = 10;	//10 is Literals
		double pi = 3.14;//pi is variable, the value is allowed to change
		pi = 10;
		final double PI = 3.1415926;	//PI is constant
//		PI = 5;//wrong, constant are not allowed to revalue
		
		//format specifier   
		//%d	a int value
		//%f	a float value
		System.out.println(PI);
		System.out.printf("the pi in math is %.2f",PI);
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("plese enter your age:");
		int age = scanner.nextInt();
		if(age<0 || age>150) {
			System.out.println(age+" is an invalid age");
		}else {
			System.out.println("good, you are "+age+" years old now");
		}
	}

}




















