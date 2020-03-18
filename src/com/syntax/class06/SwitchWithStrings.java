package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		/*ask a user where he or she is from
		 * based on the country we will define favorite food 
		 * your favorite food is ___
		 */
		
		Scanner scan;
		String country;
		String favoritefood;
		
		scan=new Scanner(System.in);
		System.out.println("Please eneter your counrty");
		country=scan.nextLine();
		
		switch(country) {
		
		case "Morroco":
			favoritefood="couscous";
			break;
		case "Belarus":
			favoritefood="Potato";
			break;
		case "Takijistan":
			favoritefood="Osh";
			break;
		case "Turkey":
			favoritefood="Baklava";
			break;
		case "Afghanistan":
			favoritefood="Mantu";
			break;
		case "Kazakhstan":
			favoritefood="Beshparmak";
			break;
		default:
			favoritefood="Unknown";
		}
		
		System.out.println("Your favorite food is "+favoritefood);
		
	}

}
