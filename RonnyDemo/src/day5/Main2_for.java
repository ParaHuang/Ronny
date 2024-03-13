package day5;

public class Main2_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(initial value;condition;increment) {
//			operations
//		}
		
		//	A			B	 C
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println("hello");//D
//		}
		//A->B->D->C->B->D->C->B->D->C->B(it's false)the end
		
		/*
		int i=1;		//A
		while(i<=5) {	//B
			System.out.println("hello");//D
			i++;		//C
		}
		*/
//		do...while...
//		int i=1;
//		while(i>5) {
//			System.out.println("hello");
//			i++;
//		}
		int i =1;
		do {
			System.out.println("hello");
			i++;
		}while(i>5);
	}

}













