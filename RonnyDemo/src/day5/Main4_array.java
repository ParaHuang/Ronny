package day5;

import java.util.Scanner;

public class Main4_array {

	public static void main(String[] args) {
		//define an array to save 5 student's scores
		//enter score for student one by one, then save them into array
		//calculate the sum score and average score
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("please enter the socre for student "+(i+1)+":");
			arr[i] = scanner.nextInt();
			sum+=arr[i];
		}
		
//		System.out.println("please enter the socre for student 1:");
//		arr[0] = scanner.nextInt();
//		sum+=arr[0];
//		
//		System.out.println("please enter the socre for student 2:");
//		arr[1] = scanner.nextInt();
//		sum+=arr[1];
//		
//		System.out.println("please enter the socre for student 3:");
//		arr[2] = scanner.nextInt();
//		sum+=arr[2];
//		
//		System.out.println("please enter the socre for student 4:");
//		arr[3] = scanner.nextInt();
//		sum+=arr[3];
//		
//		System.out.println("please enter the socre for student 5:");
//		arr[4] = scanner.nextInt();
//		sum+=arr[4];
		System.out.println("the socres are:");
		for(int i=0 ; i<arr.length ; i++){
			System.out.println(arr[i]);
		}
		System.out.println("the sum socre is:"+sum);
		double avg = (double)sum/arr.length;
		System.out.println("the average score is:"+avg);
	}

}












