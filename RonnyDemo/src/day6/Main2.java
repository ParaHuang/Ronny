package day6;

public class Main2 {

	public static void main(String[] args) {
		//1.abs
		System.out.println(Math.abs(-10));
		
		//2.min
		System.out.println(Math.min(10, 20));
		
		//3.max
		System.out.println(Math.max(10, 20));
		//the max one out of 3 numbers
		int a = 11;
		int b = 90;
		int c = 45;
	
//		int bigger = Math.max(a, b);
		int max = Math.max(Math.max(a, b), c);
		System.out.println(max);
		System.out.println(Math.max(10, 20));
		
		
		
		//4.pow
		System.out.println(Math.pow(2, 5));
		
		
		//5.sqrt
		System.out.println(Math.sqrt(64));
		
		
		//6.ceil
		System.out.println(Math.ceil(4.9));
		System.out.println(Math.ceil(4.1));
		System.out.println();
		
		
		//7.floor
		System.out.println(Math.floor(4.9));
		System.out.println(Math.floor(4.1));
		System.out.println();
				
		
		//8.round
		System.out.println(Math.round(4.7));//5
		System.out.println(Math.round(4.3));//4
		System.out.println(Math.round(4.5));//5
		
	}

}













