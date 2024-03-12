package day4;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//branch
		/*
		 if(expression1){
		 	operationsA
		 }else if(expression2){
		 	operationsB
		 }else if(expression3){
		 	operationsC
		 }else if(expression4){
		 	operationsD
		 }else{
		 	operationsE
		 }
		 */
		Scanner scanner = new Scanner(System.in);
		//to see if an integer number is even 
		System.out.println("please enter your score");
		int score = scanner.nextInt();
		/*
		<0 or >100 , invalid score
		0~100
		 <60, you failed  >=0
		 60~69,you passed the exam
		 70~79,you get a good score
		 80~89,you got a great score
		 >=90,excellent
		 */
		if(score<0 || score>100) {
			System.out.println("invalid score");
		}else if(score<60) {
			System.out.println("you failed");
		}else if(score<=69) {
			System.out.println("you passed the exam");
		}else if(score<=79) {
			System.out.println("you get a good score");
		}else if(score<=89) {
			System.out.println("you got a great score");
		}else {
			System.out.println("excellent");
		}
		
		if(score<0 || score>100) {
			System.out.println("invalid score");
		}else{//0~100
			System.out.println("valid");
			if(score<60) {
				System.out.println("you failed");
			}else if(score<=69) {
				System.out.println("you passed the exam");
			}else if(score<=79) {
				System.out.println("you get a good score");
			}else if(score<=89) {
				System.out.println("you got a great score");
			}else {
				System.out.println("excellent");
			}
		}
		
		
		
	}

}

















