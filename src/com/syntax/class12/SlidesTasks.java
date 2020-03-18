package com.syntax.class12;

import java.util.Scanner;

public class SlidesTasks {

	public static void main(String[] args) {
		//task 1
		String str="sunday";
		char reverse;
		for(int i=str.length()-1; i>-1; i--) {
			reverse=str.charAt(i);
			System.out.print(reverse);
		}
		System.out.println();
		
	
	//task 3 
	Scanner scan= new Scanner (System.in);
	System.out.println("What is moms first name");
	String name1 =scan.nextLine();
	System.out.println("What is dads first name");
	String name2= scan.nextLine();
	System.out.println("Boy or Girl?");
	String babyname=scan.nextLine();
	
	String Suggestedname=null;
	
			

}
}