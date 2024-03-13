package day5;

import java.util.Scanner;

public class Main1_while {

	public static void main(String[] args) {
		//limit but with certain times of loop 
		//1.initial values   2.condition   3.increment
//		int i=1;						//1
//		while(i<=5) {					//2
//			System.out.println("hello");	
//			i++;						//3
//		}
		
		//limit but you don't know how many times exactly
		//you are going to open a pet shop
		//you need to buy dog and cat
		//the condition is that you only 5 dogs
		//after finished buying, print how many pet you have now?
		
		Scanner scanner = new Scanner(System.in);
		int dogCount = 0;
		int count=0;
		while(true) {
			System.out.println("what do you want to buy?1-dog 2-cat");
			int pet = scanner.nextInt();
			count++;//no matter what pet it is, you add 1
			if(pet==1) {
				dogCount++;
			}
			
			if(dogCount == 5) {
				break;
			}
		}
		System.out.println("you have "+count+" pets");
	}
	//while:limit but you don't know how many times exactly
	//for:limit but with certain times of loop 
/*
	for(initial value;condition;increment){
	
	}
*/

}













