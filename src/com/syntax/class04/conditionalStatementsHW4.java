package com.syntax.class04;

import java.util.Scanner;

public class conditionalStatementsHW4 {

	public static void main(String[] args) {
		/* Write a program that takes the length \
		 * and width from user.
		 * based on the value define wether object is 
		 * rectangle or square
		 */

		Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter the Length");
		  int Length=scan.nextInt();
		  System.out.println("Please enter the width");
		  int Width=scan.nextInt();
		  int Sum=Length;
		  int Sum1=Width;
		  if(Sum>Sum1) {
			  System.out.println("Your object is a rectagle");
		  }else if(Sum==Sum1) {
			  System.out.println("Your object is a Square");
		  }
		
		
	}

}
