package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		// declare date and a day
		//if day is friday-->if date is 13-->watch a scary movie
		//					-->if date is not 13--> watch a comedy
		
		boolean isFriday=true;
				int date=14;
				
				if(isFriday) {
					System.out.println("Today is friday, i am going to the movies");
					
					if(date==13) {
						System.out.println("Ill watch a scary movie");
					}else {
						System.out.println("Ill watch a comedy");
					}
					
				}else {
					System.out.println("Today ia not friday, i am staying home");
				}

	}

}
