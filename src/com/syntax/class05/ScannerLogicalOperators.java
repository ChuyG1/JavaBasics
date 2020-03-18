package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperators {

	public static void main(String[] args) {
		/*Take age input from a user and then based on the age
		 * print output.
		 * if age from0-3--> you are a baby
		 * if age from 4-5--> you are a kid
		 * if age from 6-12--> you are a child
		 * if age from 13-19--> you are teenager
		 * if age from 20-64--> you are a adult 
		 * if age more or equal to 65--> you are a senior
		 */
		//1. declare all variables
		int age;
		//2. capture values
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
		//3. perform verification
		
		String Human;
		
		if (age>0) {
		if (age>=0&&age<3) {
			System.out.println("You are a baby");
		}else if (age>=3&&age<=5) {
			System.out.println("You are a kid");
		}else if (age>=4&&age<=12) {
			System.out.println("You are a child");
		}else if (age>=12&&age<=19) {
			System.out.println("You are a teenager");
		}else if (age>=19&&age<=64) {
			System.out.println("You are a adult");
		}else if (age>65) {
			System.out.println("You are enjoying life");
		}
		}else {
			System.out.println("Please enter valid age");
		}
		
	}

}
