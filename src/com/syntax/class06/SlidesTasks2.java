package com.syntax.class06;

import java.util.Scanner;

public class SlidesTasks2 {

	public static void main(String[] args) {
		/*Allow user to enter grade and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		String grade;
		String finalgrade;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=scan.next();
		
		switch (grade) {
		
		case "A":
			finalgrade="Excellent";
		break;
		case "B":
			finalgrade="Good";
		break;
		case "C":
			finalgrade="Average";
		break;
		case "D":
			finalgrade="Bad";
		break;
		default:
			finalgrade="Not acceptable";
		
		}
		System.out.println("Your final grade is "+finalgrade);
			
		
		
		
		
		
		
		
		
		
		
	}

}
