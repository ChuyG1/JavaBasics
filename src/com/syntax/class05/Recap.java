package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// Use this for decimal numbers that users might input.
		
		System.out.println("Please enter any decimals");
		double d=scan.nextDouble();
		// Use this one for boolean.
		boolean b=scan.hasNextBoolean();
		// use this for char
		char variable=scan.next().charAt(0);
		// use this to compare strings
		String answer=scan.nextLine();
		if (answer.equals("")) {}
		// use this to compare booleans
		boolean answer1=scan.nextBoolean();
		if(answer1) {}
		/* to test 2 conditions you have logical operators in java
		 * AND, O, NOT 
		 * AND (&&) for the AND  condition to work both sidesmust be true
		 * IF(true && true)-->true
		 * IF(true && false)-->false
		 * IF(false && true)-->false
		 * IF(false && false)-->false
		 * 
		 * OR(||)
		 * IF(true||true)--> true
		 * IF(true||false)-->true
		 * IF(false||true)-->true
		 * IF(false||false)-->false
		 * 
		 * NOT - reverse the condition
		 */
		
		
	}

}
