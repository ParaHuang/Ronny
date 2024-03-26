package semesterProject;

import java.util.Scanner;

public class Main {
	private static int[] studentId; 
	private static String[] firstName;
	private static String[] lastName;
	private static int[] scienceScore;
	private static int[] historyScore;
	private static int[] mathematicsScore;
	private static int[] englishScore; 
	private static int[] totalScore;
	private static double[] percentage;
	private static int totalPassNumber,scienceFailedNumber,historyFailedNumber,englishFailedNumber,mathematicsFailedNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadStudents readStudents = new ReadStudents();

		studentId = readStudents.getStudentId();
		firstName = readStudents.getFirstName();
		lastName = readStudents.getLastName();
		scienceScore = readStudents.getScienceScore();
		historyScore = readStudents.getHistoryScore();
		mathematicsScore = readStudents.getMathematicsScore();
		englishScore = readStudents.getEnglishScore();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Student Management System");
		while(true) {
			System.out.println("\nplease enter your choice");
			System.out.println("1.Display the information of each student");
			System.out.println("2.Calculate the total score");
			System.out.println("3.Calculate the total percentage");
			System.out.println("4.Display the information of top 10 students");
			System.out.println("5.Calculate pass and failed number");
			System.out.println("other number.exit the system");
			
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				displayInfomation(firstName.length);
				break;
			case 2:
				calculateTotalScores();
				break;
			case 3:
				calculateTotalPercentage();
				break;
			case 4:
				displayInfomation(10);
				break;
			case 5:
				calculatePassAndFail();
				break;
			default:
				System.out.println("Thank you for using the System, welcome back!!");
				return;
			}
		}
//		System.out.println(Arrays.toString(studentId));
//		System.out.println(Arrays.toString(firstName));
//		System.out.println(Arrays.toString(lastName));
//		System.out.println(Arrays.toString(scienceScore));
//		System.out.println(Arrays.toString(historyScore));
	}
	
	private static void calculatePassAndFail() {
		if(percentage==null) {
			System.out.println("you haven't calculate total percentage yet");
			return;
		}
		
		for(int i=0 ; i<percentage.length ; i++) {
			if(percentage[i]>=60) {
				totalPassNumber++;
			}
		}
		
	}

	private static void calculateTotalPercentage() {
		//what is total percentage???
		if(totalScore==null) {
			System.out.println("you haven't calculate total score yet");
			return;
		}
		
		if(percentage == null) {
			percentage = new double[200];
			//checking element in totalScore array one by one
			for(int i=0 ; i<totalScore.length ; i++) {
				percentage[i] = totalScore[i]/4.0;  
			}
			System.out.println("calculation done");
		}else {
			System.out.println("total percentage are already calculated");
		}
	}
	private static void calculateTotalScores() {
		if(totalScore==null) {
			totalScore = new int[200];
			for(int i=0 ; i<scienceScore.length ; i++) {
				totalScore[i] = scienceScore[i]+historyScore[i]+mathematicsScore[i]+englishScore[i];
			}
			System.out.println("calculation done");
		}else {
			System.out.println("total scores are already calculated");
		}
	}
	
	private static void displayInfomation(int count) {
		for(int i=0 ; i<count ; i++) {
			System.out.print(studentId[i]+"\t");
			System.out.print(firstName[i]+ (firstName[i].length()<8?"\t\t":"\t"));  
			System.out.print(lastName[i]+ (lastName[i].length()<8?"\t\t":"\t"));    
			if(totalScore != null) {
				System.out.print(totalScore[i]+"\t");
			}
			if(percentage != null) {
				System.out.print(percentage[i]);
			}
			
			System.out.println();//new line in the end
		}
	}

}

