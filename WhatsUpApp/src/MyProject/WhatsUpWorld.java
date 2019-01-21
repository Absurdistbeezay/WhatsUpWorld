package MyProject;

import java.util.Scanner;

public class WhatsUpWorld {

	public static void main(String[] args) {
		
//		String str = "Whats up World?";
//		int num1 = 1;
//		System.out.println(num1+". " + str);
//		
//		int value1 = 1;
//		int value2 = 2;
		
//		System.out.println((value1 == 1) && (value2 == 2));
//		System.out.println((value1==1)||(value2 ==1));
//		
//		float number = 123.567f;
//		String numberStr = Float.toString(number);
//		
//		int dotPosition = numberStr.indexOf('.');
//		int secondPart = numberStr.length() - dotPosition - 1;
//		
//		System.out.println("Number of chars before dot: " + dotPosition);
//		System.out.println("Number of chars after dot: " + secondPart);
//		
////		System.out.println(dotPosition);
//		String name = "ram prashad";
//		System.out.println(name.substring(0, 3));
//		
//		//Write a program to isolate different parts of a file path
//		
//		String fullPath = "home/user/vijay/index.txt";
//		
//		int lastSlashIndex = fullPath.lastIndexOf('/');
//		
////		String path = fullPath.substring(0, lastSlashIndex);
//		
//		String fullFile = fullPath.substring(lastSlashIndex+ 1, fullPath.length());
//		
//		int indexOfDot = fullFile.indexOf('.');
//		
//		String fileName = fullFile.substring(0, indexOfDot);
//		String extension = fullFile.substring(indexOfDot +1, fullFile.length());
//		
////		System.out.println("Path: " + path);
//		System.out.println(fileName);
//				
//		System.out.println("Extension: "+extension);
		
		//Marksheet
		/*
		
		System.out.println("Enter your name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		

		System.out.print("Enter PHYSICS score: ");
		int physics = input.nextInt();
		System.out.print("Enter STATISTICS score: ");
		int statistics = input.nextInt();
		System.out.print("Enter ENGLISH score: ");
		int english = input.nextInt();
		
		int total = physics + statistics + english;
		float percent = (total/300f) * 100f;
		
		
		
		System.out.println(name + ": " + percent +"%");
		*/
		
		System.out.print("Enter your name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		int total = 0;
		
		String[] subjects = {"Science", "Math", "Programming", "English"};
		
		for(int i = 0; i< subjects.length; i++) {
			System.out.print("Enter "+ subjects[i] + " score: ");
			int score = input.nextInt();
			
			total += score;
			
		}
		
		float percent = (total/400f) * 100f;
		
		System.out.println(name +", your total score is: " + total + ". Your percentage is: "+ percent+"%.");
		
		
		
		
		
		
		
		
		
		
	}
}
