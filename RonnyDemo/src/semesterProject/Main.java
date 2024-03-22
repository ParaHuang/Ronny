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
			System.out.println("other number.exit the system");
			
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				displayAllInfomation();
				break;
			case 2:
				calculateTotalScores();
				break;
			case 3:
				calculateTotalPercentage();
				break;
			case 4:
				displayTop10Infomation();
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
	private static void displayTop10Infomation() {
		for(int i=0 ; i<10 ; i++) {
			System.out.print(studentId[i]+"\t");
			System.out.print(firstName[i]+ (firstName[i].length()<8?"\t\t":"\t"));  
			System.out.print(lastName[i]+ (lastName[i].length()<8?"\t\t":"\t"));    
			if(totalScore != null) {
				System.out.println(totalScore[i]);
			}else {
				System.out.println();
			}
		}
	}
	private static void calculateTotalPercentage() {
		//what is total percentage???
		
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
	private static void displayAllInfomation() {
		// TODO Auto-generated method stub
		for(int i=0 ; i<studentId.length ; i++) {
			System.out.print(studentId[i]+"\t");
			System.out.print(firstName[i]+ (firstName[i].length()<8?"\t\t":"\t"));  
			System.out.print(lastName[i]+ (lastName[i].length()<8?"\t\t":"\t"));    
			if(totalScore != null) {
				System.out.println(totalScore[i]);
			}else {
				System.out.println();
			}
		}
	}

}

