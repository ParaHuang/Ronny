package day3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		//inches to centimeter
//		System.out.println("please enter the inches:");
//		Scanner scanner = new Scanner(System.in);
//		double inches = scanner.nextDouble();
//		double cm = inches*30.48;
//		System.out.println(inches +" inches is "+cm+" centimeters");
		
		// = : assigning value into a variable
		//== : compare two value, see if they are the same
		int a = 10;
		int b = 5;
		System.out.println(a==b);
		
		//math operators:  +   -   *   /   %
		//relational operators: >    >=    <    <=   ==   !=  (the result is always true/false--boolean)
		//logical operators:  &&   ||   !  (the result is always true/false--boolean)
		//assignment operators:   =    +=   -=    *=   /=    %=
		
		//priority:  math > relational  > logical
		
		
		System.out.println(a>=b);//true
		System.out.println("==================");
		
		//&&:and, when both side are true, then the result is true
		System.out.println(true&&true);		//true
		System.out.println(true&&false);	//false
		System.out.println(false&&true);	//false
		System.out.println(false&&false);	//false
		
		//if tomorrow is sunny day, and I get paid, then I'll go shopping?
		//will I go shooping when....
		//1.tomorrow is sunny day, I get paid				 yes
		//2.tomorrow is sunny day, but I didn't get paid.    no
		//3.tomorrow is raining, I get paid					 no
		//4. tomorrow is raining, I don't get paid			no
		System.out.println("==============");
		//||:or, when any one side is true, then the result is true
		System.out.println(true||true);		//true
		System.out.println(true||false);	//true
		System.out.println(false||true);	//true
		System.out.println(false||false);	//false
		
		//if tomorrow is sunny day, or I get paid, then I'll go shopping?
		//will I go shooping when....
		//1.tomorrow is sunny day, I get paid				 yes
		//2.tomorrow is sunny day, but I didn't get paid.    yes
		//3.tomorrow is raining, I get paid					 yes
		//4. tomorrow is raining, I don't get paid			 no
		System.out.println("==============");
		
		
		//!  : not 
		System.out.println(!true);		//false
		System.out.println(!false);		//true

		System.out.println("==============");
		System.out.println(3+4>2 && 5/2>1);	//true
		//                 2.5->2
		System.out.println(5/2);//integer operates with interger, the result is still integer

		System.out.println("==============");
		int x = 10;
		x+=5; //x = x + 5;	//15
		x-=9; //x = x - 9;	//6
		x*=3; //18
		x/=2; //9
		x%=2; //1
		
		System.out.println(x);
	}

}













