package semesterProject;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static Logger log = LogManager.getLogger(ReadStudents.class);
	
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
	private static double sciencePercentage,historyPercentage,englishPercentage,mathematicsPercentage;
	private static int failedNumber;
	private static boolean isCalculatedPass = false;
	private static boolean isCalculatedPassPercentage = false;
	private static boolean isFialedCalculated = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadStudents rs = new ReadStudents();

		studentId = ReadStudents.getStudentId();
		firstName = ReadStudents.getFirstName();
		lastName = ReadStudents.getLastName();
		scienceScore = ReadStudents.getScienceScore();
		historyScore = ReadStudents.getHistoryScore();
		mathematicsScore = ReadStudents.getMathematicsScore();
		englishScore = ReadStudents.getEnglishScore();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Student Management System");
		while(true) {
			System.out.println("\nplease enter your choice");
			System.out.println("1.Display the information of each student");
			System.out.println("2.Calculate the total score");
			System.out.println("3.Calculate the total percentage");
			System.out.println("4.Display the information of top 10 students");
			System.out.println("5.Calculate pass and failed number");
			System.out.println("6.Calculate pass percentage");
			System.out.println("7.Calculate the number of students who failed at least 2 subjects");
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
			case 6:
				calculatePassPercentage();
				break;
			case 7:
				calculateFailedNumber();
				break;
			default:
				System.out.println("Thank you for using the System, welcome back!!");
				return;
			}
		}
	}
	
	private static void calculateFailedNumber() {
		if(!isFialedCalculated) {
			isFialedCalculated = true;
			for(int i=0 ; i<studentId.length ; i++) {
				int count = 0;
				if(scienceScore[i]<60) {
					count++;
				}
				if(historyScore[i]<60) {
					count++;
				}
				if(englishScore[i]<60) {
					count++;
				}
				if(mathematicsScore[i]<60) {
					count++;
				}
				if(count>2) {
					failedNumber++;
				}
			}
			
			System.out.println("calculation done");
		}else {
			System.out.println("it's already calculated ");
		}
	}

	private static void calculatePassPercentage() {
		if(!isCalculatedPass) {
			System.out.println("please calculate pass and failed number firstly");
			return;
		}
		
		if(!isCalculatedPassPercentage) {
			isCalculatedPassPercentage = true;
			int num = firstName.length;
			sciencePercentage = (num-scienceFailedNumber)/(double)num*100;
			historyPercentage = (num-historyFailedNumber)/(double)num*100;
			englishPercentage = (num-englishFailedNumber)/(double)num*100;
			mathematicsPercentage = (num-mathematicsFailedNumber)/(double)num*100;
			System.out.println("calculation done");
			
		}else {
			System.out.println("pass percentages are already calculated ");
		}
	}

	private static void calculatePassAndFail() {
		if(percentage==null) {
			System.out.println("you haven't calculate total percentage yet");
			return;
		}
		if(!isCalculatedPass) {
			isCalculatedPass = true;
			for(int i=0 ; i<percentage.length ; i++) {
				if(percentage[i]>=60) {
					totalPassNumber++;
				}
				
				if(scienceScore[i]<60) {
					scienceFailedNumber++;
				}
				
				if(historyScore[i]<60) {
					historyFailedNumber++;
				}
				
				if(englishScore[i]<60) {
					englishFailedNumber++;
				}
				
				if(mathematicsScore[i]<60) {
					mathematicsFailedNumber++;
				}
			}
			System.out.println("calculation done");
		}else {
			System.out.println("total pass number and each subject failed number are already calculated ");
		}
		
	}

	private static void calculateTotalPercentage() {
		
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
		if(count==studentId.length && isCalculatedPass) {
			System.out.println(totalPassNumber + " students passed");
			System.out.println(scienceFailedNumber+" students failed in science");
			System.out.println(historyFailedNumber+" students failed in history");
			System.out.println(englishFailedNumber+" students failed in english");
			System.out.println(mathematicsFailedNumber+" students failed in math");
		}
		
		if(count==studentId.length && isCalculatedPassPercentage) {
			System.out.println("science pass percentage is "+sciencePercentage + "%");
			System.out.println("history pass percentage is "+historyPercentage + "%");
			System.out.println("english pass percentage is "+englishPercentage + "%");
			System.out.println("mathematics pass percentage is "+mathematicsPercentage + "%");
		}
		
		if(count==studentId.length && isFialedCalculated) {
			System.out.println(failedNumber+" students failed more than 2 subjects");
		}
	}
}












