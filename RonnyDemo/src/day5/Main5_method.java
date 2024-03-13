package day5;

public class Main5_method {
	public static void main(String[] args) {
		fun1();
		fun1();
		fun1();
		
		fun1(3);//3,argument
		fun1(7);//7,argument
		System.out.println("------------------");
//		int x = fun2();
//		System.out.println(x);
		
		int x = fun2();
		if(x%2==0) {
			System.out.println("hello");
		}else {
			System.out.println("world");
		}
		
		
		int y = fun2(5);//5*5
		int z = fun2(8);//8*8
		System.out.println(y);
		System.out.println(z);
	}
	
	//methods
	//1.define
	/*
	 public void/returnType methodName(parameter list){
	 	body
	 }
	 parameter list:  type1 name1,type2 name2,type3 name3
	
	 */
	//void and no parameter
	public static void fun1() {
		System.out.println("print hello for 5 times");
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("hello");
		}
	}
	//void and with parameter
	public static void fun1(int n) {	//n:how many times  , it's parameter
		System.out.println("print hello for "+n+" times");
		for(int i=1 ; i<=n ; i++) {
			System.out.println("hello");
		}
	}
	
	public static int fun2() {
		int a = 3;
		int result = a*a;
		return result;	//the value you return is the result of the whole process of this method
						//then return it, so when you use this method, you will be able to get the result
						//the carry on the rest process based on this result
	}
	
	public static int fun2(int a) {
//		int a = ?;
		int result = a*a;
		return result;	//the value you return is the result of the whole process of this method
						//then return it, so when you use this method, you will be able to get the result
						//the carry on the rest process based on this result
	}
	
	
	
	//2.call/use
	//methodName(value list);	//value1,value2,value3
	//type name = methodName();
	
}










