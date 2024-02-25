package day2;

public class Main1 {

	public static void main(String[] args) {
		/*
		 * if
		 if(expression){
		 	operations
		 }
		 
		 if...else...
		 if(expression){
		 	operationsA
		 }else{
		 	operationsB
		 }
		 
		 if...else if...else if...else...
		 if(expression1){
		 	operationsA
		 }else if(expression2){
		 	operationsB
		 }else if(expression3){
		 	operationsC
		 }else{
		 	operationsD
		 }
		 
		 */
		//total:100    range:0~100
		//grade  level
		//<60    not pass
		//60~69  pass
		//70~79  ok
		//80~89  good
		//>=90	 great
		int grade = 97;
		if(grade<60) {
			System.out.println("not pass");
		}else if(grade<=69) {
			System.out.println("pass");
		}else if(grade<=79) {
			System.out.println("ok");
		}else if(grade<=89) {
			System.out.println("good");
		}else {
			System.out.println("great");
		}
		
		
		
	}

}







