package day4;

public class Main5_switch {

	public static void main(String[] args) {
		//when the result of an expression only has several meaningful value to discuss
		int day = 6;
		switch(day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;	//interrupt the switch...case...
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("invalid day");
		}
//		if(day==1) {
//			
//		}else if(day==2) {
//			
//		}
		//1:Monday  2:Tuesday  3:Wednesday.....  7:Sunday   other value:invalid day
		/*
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
		 		break;
		 }
		 */
		
	}

}

