package com.ty.studentdb;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Welcome to Student Database Mangement System");
	System.out.println("____________________________________________");
	Scanner scanner = new Scanner(System.in);
	StudentManagementSystem sms = new StudentManagementSystemImp();
	while (true) {
		System.out.println("1.Add Student \n2.Display Student");
		System.out.println("3.Display All Student \n4.Remove Student");
		System.out.println("5.Remove All Student \n6.Update Student");
		System.out.println("7.Count Student \n8.Sort Student");
		System.out.println("9.Get Student with Highest marks");
		System.out.println("10.Get Student with Lowest mark");
		System.out.println("11.Exit Choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			sms.addStudent();
			break;
		case 2:
			sms.displayStudent();
			break;
		case 3:
			sms.displayAllStudent();
			break;
		case 4:
			sms.removeStudent();
			break;
		case 5:
			sms.removeAllStudent();
			break;
		case 6:
			sms.updateStudent();
			break;
		case 7:
			sms.countStudent();
			break;
		case 8:
			sms.sortStudent();
			break;
		case 9:
			sms.getStudentWithHighestMark();
			break;
		case 10:
			sms.getStudentWithLowestMark();
			break;
		case 11:
			System.out.println("Thank you");
			System.exit(0);
			break;
		
		default:
			String message = "Invalid choice, Kindly enter valid choice";
			try { 
				throw new InvalidChoiceException(message); 
			} 

			catch (Exception e) { 
				System.out.println(e.getMessage());
			}
		}
	}
}
}
