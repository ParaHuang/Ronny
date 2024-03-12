package day4;

public class Main6_switch {

	public static void main(String[] args) {
		//when the result of an expression only has several meaningful value to discuss
		int poker = 9;
		//1:diamond Ace  2:diamond 2  3:diamond 3
		//.....10: diamond 10
		//11:diamond Jack
		//12:diamond Queen
		//13:diamond King
		//14,15:Joker
		//other numbers:invalid poker
		switch(poker) {
		case 1:
			System.out.println("diamond A");
			break;
		case 2,3,4,5,6,7,8,9,10:
			System.out.println("diamond "+poker);
			break;
		case 11:
			System.out.println("diamond Jack");
			break;
		case 12:
			System.out.println("diamond Queen");
			break;
		case 13:
			System.out.println("diamond King");
			break;
		case 14,15:
			System.out.println("Joker");
			break;
		default:
			System.out.println("invalid poker");
		}
		
	}

}

