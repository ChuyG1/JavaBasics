package com.syntax.class05;

public class MoreLogilcalOperators {

	public static void main(String[] args) {
		/*we have total 7 days in a week
		 * if day is 2,3--> SDLC class
		 * if day 6,7--> Java class
		 * if day 1,5--> Off day
		 * if day 4--> review class
		 */
		int day=6;
		// to compare 2 number we use equality operator(==)
		if(day==2&&day==3) {
			System.out.println("Today is SDLC class");
		}else if (day==6&&day==7) {
			System.out.println("Today is Java class");
		}else if (day==1&&day==5) {
			System.out.println("Today is no class, it is off day");
		}else if (day==4) {
			System.out.println("Today is review class with elion");
		}else {
			System.out.println("Invalid day");
		}
		
		System.out.println("-------------------------");
		String day1="Saturday";
		// to compare strings we use equals
		if (day1.equals("Tuesday")|| day1.equals("Wednesday")) {
		System.out.println("Today is SDLC class");
		} else if (day1.equals("Saturday")|| day1.equals("Sunday")){
		System.out.println("Today  is java class");	
		}else if (day1.equals("Thursday")) {
		System.out.println("Today is review class");
		}else if (day1.equals("Monday")|| day1.equals("Friday")) {
		System.out.println("Today is no class, it is off day");	
		}else {
		System.out.println("Invalid day");
		}
	
	
	}
}