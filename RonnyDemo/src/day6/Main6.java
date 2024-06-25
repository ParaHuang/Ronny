package day6;

import java.util.Random;

public class Main6 {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt();	//generate a big random number
		int y = random.nextInt(5);	//generate a random number from 0~n-1
		int z = random.nextInt(2,5);//generate a random number from a~n-1
		System.out.println(x+"   "+y+"   "+z);
		

		System.out.println(pow());
		System.out.println(pow(5));
		System.out.println(pow(3,4));
		
	}
	
	//overloading: methods are in the same name but with different parameters
	public static int pow() {
		return 2*2;
	}
	
	public static int pow(int a) {
		return a*a;
	}
	
	public static int pow(int a,int b) {
		int result=1;
		int i=1;	
		while(i<=b) {	
			result *= a;
			i++;
		}
		return result;
	}

}




