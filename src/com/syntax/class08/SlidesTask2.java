package com.syntax.class08;

import java.util.Scanner;

public class SlidesTask2 {

	public static void main(String[] args) {
		/* Create a program that will be asking user to apply for a credit card 10 times.
		 *  As soon you get an “yes” from a user program should stop asking.
		 */
		
		String answer;
		
		for(int C=1; C<=10; C++){
			System.out.println("Want to apply for credit card?");
			Scanner scan=new Scanner(System.in);
			answer=scan.nextLine();
			
			if(answer.equals("Yes")) {
			System.out.println("Congragulations");
				break;
			}
		}

	}

}
