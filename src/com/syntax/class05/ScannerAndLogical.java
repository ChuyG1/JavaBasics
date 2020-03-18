package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/*You are a salesman
		 * ask a user for how uch his sales are
		 * based on the amount of sales we need to calculate commission
		 * if sales are between 1-100--> commission should be 10%
		 * if sales are between 100-200--> commission will be 20%
		 * if sales are between 200-500-->commission will be 30%
		 * if sales are more than 500--> commission should be 50%
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("How much are your sales");
		double sales;
		double commission;
		sales=scan.nextDouble();
		
		if (sales>=1&&sales<=100) {
			//give user 10% commission
			commission=sales*0.10;
		}else if (sales>100&&sales<=200) {
			//give user 20% commission
			commission=sales*0.20;
		}else if (sales>200&&sales<=500) {
			//give user 30% commission
			commission=sales*0.30;
		}else {
			//give user 50% commission
			commission=sales*0.50;
		}
		
		System.out.println("Based on your sales your commission is "+"$"+commission);
		
		
	}

}
