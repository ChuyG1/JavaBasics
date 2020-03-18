package com.syntax.class04;

import java.util.Scanner;

public class ConditionalStatementsHW5 {

	public static void main(String[] args) {
 /*Write a jave statement that prints true if(x*y)
  * returns a positive value. else prints if (x*y)
  * returns a negative
  */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int	Firstnumber=scan.nextInt();
		System.out.println("Please enter second number");
		int Secondnumber=scan.nextInt();
		int Num1=Firstnumber*Secondnumber;
		if(Num1>=0) {
			System.out.println("True");
		}else if(Num1<=0) {
			System.out.println("False");
		}
		
		
		
		
	}

}
