package com.syntax.class13;

public class ProgrammingQuestion1Part2 {

	public static void main(String[] args) {
	
		// How to swap two string values without using temporary 
		// variable.
		
		String a = "Team";  
	    String b = "Hey";
	    
	    System.out.println("Before swap: " + a + " " + b);  
	
	    a = a + b; //now a is "TeamHey"
	    b = a.substring(0, a.length() - b.length()); //now b is "Team"
	    a = a.substring(b.length()); //now a is "Hey" and Strings are swapped
	    
	    System.out.println("After swap : " + a + " " + b);  

	}
}
