package day10;

public class Main2 {
	public static void main(String[] args) {
		MyInter mi1 = new MyInter() {
			@Override
			public void fun1() {
				System.out.println("a normal way to create an instance of MyInter");
			}
		};
		mi1.fun1();
		mi1.fun1();
		mi1.fun1();
		
		MyInter mi2 = new MyInter() {
			@Override
			public void fun1() {
				System.out.println("2nd way-------");
			}
		};
		mi2.fun1();
		mi2.fun1();
		mi2.fun1();
		
		//lambda expression
		/*
		 (parameter1,parameter2)->{
		 	methods body
		 }
		 
		 ==
		 
		 new XxxxInterface(){
		 	public void methodName(int parameter1, String parameter2){
		 		methods body;
		 	}
		 }
		 
		 */
//		MyInter mi3 = lambda expression;
		
		MyInter mi3 = ()->{
		 	System.out.println("3rd way:with lambda---------");
		};
		mi3.fun1();
		mi3.fun1();
		mi3.fun1();
		
		//1.if there is only 1 sentence for method body, then you can omit {}
		MyInter mi4 = ()->System.out.println("4rd way:with lambda, speciall occasion 1---------");
		mi4.fun1();
		mi4.fun1();
		mi4.fun1();
		
		//2.if there is only 1 sentence for method body,and it's returning a value,  then you can omit {} and return
//		MyInterWithReturn mi5 = new MyInterWithReturn() {
//			
//			@Override
//			public int fun() {
//				// TODO Auto-generated method stub
//				return 1234;
//			}
//		};
		MyInterWithReturn mi5 = ()->1234;
		int a = mi5.fun();
		System.out.println(a);
		
		//for mi6, fun is gonna take 1 parameter, and return the square of it
//		MyInterWithReturnAndParams mi6 = new MyInterWithReturnAndParams() {
//			@Override
//			public int fun(int x) {
//				// TODO Auto-generated method stub
//				return x*x;
//			}
//		};
		
		MyInterWithReturnAndParams mi6 = (x)->x*x;
		System.out.println(mi6.fun(9));
		
		//3.if there is only 1 parameter, you can omit ()
		MyInterWithReturnAndParams mi7 = x->x*x;
		System.out.println(mi7.fun(11));
		
	}
}

//Functional interface:a interface with only 1 abstract method
@FunctionalInterface
interface MyInter{
	void fun1();
//	void fun2();
//	void fun3();
//	default void fun2() {}
//	default void fun3() {}
//	default void fun4() {}
	
}


interface MyInterWithReturn{
	int fun();
}


interface MyInterWithReturnAndParams{
	int fun(int x);
}







