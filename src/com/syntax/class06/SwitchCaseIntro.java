package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		int day;
		String today;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a nummber from 1-7");
		day=scan.nextInt();
		
		
		switch(day) {
		
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3: 
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
			default:
				today="Invalid";
		
		}
		System.out.println("today is "+today);
	}

}
