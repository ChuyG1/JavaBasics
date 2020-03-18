package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// Capture name from user and print it the format
		// My name id
		
		//1. Bring scanner class into program
		//   System.in --> Identifies keyboard
		Scanner scan=new Scanner(System.in);
		// Instruct user of what program expects
		System.out.println("Please enter your name");
		// Capture line of strings from a user
		String name=scan.nextLine();
		System.out.println("My name is "+name);
		// Instruct user of what program expects
		System.out.println("How old are you?");
		// Capture number from user
		int age=scan.nextInt();
		System.out.println("Your name is "+name+" Your age is "+age);
				

	}

}
