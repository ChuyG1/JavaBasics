package com.syntax.class08;

import java.util.Scanner;

public class SlidesTask3 {

	public static void main(String[] args) {
		/*Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money accumulate the amount and tell the user how much is left to pay off the amount.
		 *  If user give more money program should return a change. 
		 *  Whenever a user done with payments program should say
		 *   “Thank you for shopping!”
		 */
		String item;
		int price=0;
		int amountpaid=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What item do you want to buy");
		item=scan.nextLine();
		System.out.println("What is the price of the item");
		price=scan.nextInt();
		
		int moneyinserted1;
		int moneyinserted2=0;
		while (price>=amountpaid) {
			System.out.println("Insert money please");
			moneyinserted1=scan.nextInt();
			moneyinserted2=moneyinserted2+moneyinserted1;
			if(moneyinserted2>=price) {
			System.out.println("Thank you for shopping!");
			}else {
				
				System.out.println("you owe = "+(price-moneyinserted2));
			}
		}
		
		
	}

}
