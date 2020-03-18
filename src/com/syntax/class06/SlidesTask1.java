package com.syntax.class06;

import java.util.Scanner;

public class SlidesTask1 {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("What country are your from");
		country=scan.nextLine();
		
		switch (country) {
		
		case "Mexico":
			language="Spanish";
			break;
		case "United states":
			language="English";
			break;
		case "France":
			language="French";
			break;
		case "Germany":
			language="German";
			break;
		case "Netherlands":
			language="Dutch";
			break;
		default:
			language="Unknown";
		
		
		}
		
		System.out.println("Your languuage is "+language);
		

	}

}
