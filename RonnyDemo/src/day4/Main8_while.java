package day4;

public class Main8_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//1 2 3 4 5 ....99 100
		int i=1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		*/
		//2 4 6 8 ... 96 98 100
		int i=1;
		while(i<=100) {
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
	}

}

