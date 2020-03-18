package com.syntax.class13;

public class ProgrammingQuestion1 {

	public static void main(String[] args) {
	
	//How to swap two numbers without using Temporary
	//Variable
	
	int a = 10;
	int b = 20;
	
	System.out.println("Value of a and b before swapping, a:"+a+" b:"+b);
		
	a = a+b; //now a is 30 and b is 20
	b = a-b; //now a is 30 but b is 10 (original value of a)	
	a = a-b; //now a is 20 and b is 10, numbers are swapped
	
	System.out.println("Value of a and b after swapping, a:"+a+" b:"+b);
	}
}
