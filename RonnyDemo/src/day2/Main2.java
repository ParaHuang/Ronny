package day2;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 while
		 while(expression){
		 	operations
		 }
		 */
		/*
		while(true) {
			System.out.println("hello");
		}
		*/
		
		//print hello for 5 times
		/*
		int i = 1;
		while(i<=5) {
			System.out.println("hello");	//1hello	2hello	3hello	4hello	5hello
			i++;//i+=1;//i=i+1;  			//2			3		4		5		6
		}
		*/
		/*
		//print every number from 1 to 100  
		//when you see same/similar stuff keep repeating ->loop
		int i = 1;	//loop variable
		while(i<=100){
			System.out.println(i);
			i++;
		}
		*/
		
		// 9%2 == 1 odd     i%2 == 0 even
		/*
		//print every even number from 1 to 100  
		int i = 1;	//loop variable
		while(i<=100){
			//i will be every number from 1 to 100 one by one
			if(i%2 == 0){
				System.out.println(i);
			}
			i++;
		}
		*/
		//print every odd number from 1 to 100  
		int i = 1;	//loop variable
		while(i<=100){
			//i will be every number from 1 to 100 one by one
			if(i%2 != 0){
				System.out.println(i);
			}
			i++;
		}
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		//........
		System.out.println(100);
		*/
	}

}













