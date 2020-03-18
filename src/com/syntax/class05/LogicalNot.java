package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// NOT(!) - reverse the condition
		boolean b=!true;
		boolean val=!false;
		
		System.out.println(b);
		System.out.println(val);

		boolean isCold=true;
		if(!isCold) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}

		String day1="Monday";
		String day2="Friday";
		
		//if it is not monday or friday-->find me at syntax
		if(!day1.equals("Monday")&&day2.contentEquals("Friday"));
		System.out.println("Find me at syntax");
		
		// day is not monday and my day is not friday.
		if(!(day1.equals("Monday")||day2.contentEquals("Friday")));
		System.out.println("Find me at syntax");
	}

}
