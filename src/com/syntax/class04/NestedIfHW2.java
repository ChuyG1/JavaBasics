package com.syntax.class04;

import java.util.Scanner;

public class NestedIfHW2 {

	public static void main(String[] args) {
 /*Ask the user to enter his/her gender
  * "Please enter your gender : M or F"
  * and their age "Please enter your first name"
  * 
  */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your gender");
		char Gender=scan.next().charAt(0);	
		System.out.println("Please enter your age");
		int age=scan.nextInt();
				
		if(age>25) {
			if(Gender == 'M') {
			System.out.println("Man");
		}else {
			System.out.println("Woman");
		}} else {
			if(Gender=='M') {
				System.out.println("Boy");
			}else {
				System.out.println("Girl");
			}
		
	}


	}
}
