package day6;

public class Main4 {

	public static void main(String[] args) {
		/*
		switch....case... : the result of an expression or variable only has limit meaningful possibility to discuss
		switch(expression){
			case value1:
				operationA;
				break;
			case value2:
				operationB;
				break;
			case value3:
				operationC;
				break;
			case value4:
				operationD;
				break;
			default:
				operationE;
		}
		*/
		int poker = 8;	//1~15
		//1:you get a heart of Ace
		//2:you get a heart of 2
		//3:you get a heart of 3
		//.......
		//10:you get a heart of 10
		//11:you get a heart of J
		//12:you get a heart of Q
		//13:you get a heart of K
		//14:you get a Joker
		//15:you get a Joker
		
		switch (poker) {
		case 1:
			System.out.println("you get a heart of Ace");
			break;
		case 14,15:
			System.out.println("Joker");
			break;
		case 11:
			System.out.println("you get a heart of J");
			break;
		case 12:
			System.out.println("you get a heart of Q");
			break;
		case 13:
			System.out.println("you get a heart of K");
			break;
		default:
			System.out.println("you get a heart of "+poker);
			break;
		}
		
	
		
		
		
		
		
		
		
	}

}











