package day6;

public class Main3 {

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
		
		int day = 3;
		//1--Monday
		//2--Tuesday
		//.....
		//7--Sunday
		//others--invalid value
		
		if(day==1) {
			System.out.println("Monday");
		}else if(day==2) {
			System.out.println("Monday");
		}else if(day==3) {
			System.out.println("Monday");
		}else if(day==4) {
			System.out.println("Monday");
		}else if(day==5) {
			System.out.println("Monday");
		}else if(day==6) {
			System.out.println("Monday");
		}else if(day==7) {
			System.out.println("Monday");
		}else{
			System.out.println("invalid value");
		}
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Monday");
			break;
		case 4:
			System.out.println("Monday");
			break;
		case 5:
			System.out.println("Monday");
			break;
		case 6:
			System.out.println("Monday");
			break;
		case 7:
			System.out.println("Monday");
			break;
		default:
			System.out.println("invalid value");
			break;
		}
		
		
	}

}











