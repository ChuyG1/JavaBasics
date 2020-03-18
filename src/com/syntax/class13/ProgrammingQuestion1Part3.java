package com.syntax.class13;

public class ProgrammingQuestion1Part3 {

	public static void main(String[] args) {
	//How to swap two numbers without using temporary
	//Variable.
	//Method #2 using Multiplication/Division
		
	int a = 6;
	int b = 3;
	
	System.out.println("Value of a and b before swapping, a:"+a+" b:"+b);
	
	a = a*b; // now a is 18 and b is 3
	b = a/b; // now a is 18 but b is now 6 (original value of a)
	a = a/b; //now a is 3 and b is, numbers are swapped
	
	System.out.println("Value of a and b after swapping, a:"+a+" b:"+b);
	}

}
