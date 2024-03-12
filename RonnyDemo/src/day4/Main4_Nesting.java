package day4;

import java.util.Scanner;

public class Main4_Nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I keep my money inside of safeA, the password is 2333
		//then I keep my safeA inside of safeB, the password is 666
		//the mission is to get money out, if any password is wrong
		//then mission failed
		Scanner scanner  = new Scanner(System.in);
		System.out.println("please enter the password for safeB:");
		int pwdB = scanner.nextInt();
		if(pwdB==666) {
			
			System.out.println("safeB opened,now please enter the password of safeA:");
			int pwdA = scanner.nextInt();
			if(pwdA==2333) {
				System.out.println("mission completed, you got the money");
			}else {
				System.out.println("mission failed");
			}
			
			
			
		}else {
			System.out.println("mission failed");
		}
		
		
		
	}

}

