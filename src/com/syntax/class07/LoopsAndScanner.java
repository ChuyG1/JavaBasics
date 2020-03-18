package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		int luckynumber=17;

		do {
			System.out.println("Please enter any number from 1-20");
			num=scan.nextInt();
			
		}while (num!=luckynumber); 
		System.out.println("Congrats");
		
	}

}
