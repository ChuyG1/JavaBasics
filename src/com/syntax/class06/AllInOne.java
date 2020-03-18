package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		/* Write a program to ask user if there is a 
		 * sale going on.
		 * If no sale--> Not going shopping
		 * if sale we will ask the price of the item
		 * based on the price we will apply discount and 
		 * calculate final price.
		 * if price is less than 20--> apply 10% discount
		 * if price is between 20-100--> apply 20% discount
		 * if price between 100-500--> apply 30% discount
		 * if price more than 500--> apply 50% discount
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		String sale;
		double price;
		double discount=0;
		double finalprice=0;
		System.out.println("Is there a sale going on?");
		sale=scan.next();
		
		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price of the item");
			price=scan.nextDouble();
			if (price<=20) {
			discount=price*0.1;
			}else if (price>=10&&price<100) {
				discount=price*0.2;
			}else if (price>=100&&price<500) {
				discount=price*0.3;
			}else if (price>500) {
				discount=price*0.5;
			}else {
				System.out.println("Not going shopping");
			}
			finalprice=price-discount;
			System.out.println("After "+discount+" discount the price of the item is "+finalprice);
		}
	}

}
