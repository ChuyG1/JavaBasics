package com.syntax.class04;

import java.util.Scanner;

public class scannerHW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input the boolean value");
		int value=scan.nextInt();
		boolean input=value>=0;
			
		
		System.out.println("The value is "+input);
	}
	  

}
