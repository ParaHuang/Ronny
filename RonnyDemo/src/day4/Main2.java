package day4;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 if(expression){
		 	operations
		 }
		 when expression is true, then execute operations
		 
		 
		 if(expression){
		 	operationsA
		 }else{
		 	operationsB
		 }
		 
		 */
		Scanner scanner = new Scanner(System.in);
		//to see if an integer number is even 
		System.out.println("please enter an integer number");
		int num = scanner.nextInt();
		if(num%2==0){//even number is divisible by 2
			System.out.println(num+" is an even number");
		}else {
			System.out.println(num+" is odd");
		}
	}

}









