package day1;

import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method: a part code to finish some certain operations
		//method overloading: methods with the same name but different parameters
		//				to do a certain operations from different way/with different material
		Random random = new Random();
		random.nextInt();//returns a random number without a certain bound
		int y = random.nextInt(5);//returns a random number  from 0 to 4
		int z = random.nextInt(2,6);//returns a random number  from 2 to 5
		
//		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		fun(10,5);
//		System.out.println(fun(5, 10));//return type is not essential to accept
//		int a = fun(10,11);//if return type is not essential, then it can't decide a method is unique or not
	}
	
	//parameters are different
	//1.different amount
	//2.different type
	//3.different order(we don't really use this one)
	public static void fun() {
		System.out.println("hello");
	}
	
	public static void fun(int a,String b) {
		System.out.println("world");
	}
	
	public static void fun(String a,int b) {
		System.out.println("world");
	}
	
	//factory : create toy car. you give it plastic(parameter), and it returns a car
//	public static int fun(int a,int b) {
//		System.out.println("world");
//		return a+b;
//	}//not method overloading. because overloading has nothing to do with return type
	
	public static void fun(int a,int b) {
		System.out.println("world");
	}
	
	public static void abc() {
		
	}
	 
}













