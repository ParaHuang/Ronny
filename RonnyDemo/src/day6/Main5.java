package day6;

public class Main5 {
	public static void main(String[] args) {
		/*
		 while(expression){
		 	operation
		 }
		 */
		/*
		//limit times of loop
		int i=1;	//initial value
		while(i<=5) {	//condition
			System.out.println("hello");
			i++;//increment
		}
		*/
		//2^5->32  times 2 for 5 times
		//result   5times->loop variable
		
		int result=1;
		int i=1;	//initial value
		while(i<=5) {	//condition
			//something
			result *= 2;
			i++;//increment
		}
		System.out.println(result);
		
		
	}

}
