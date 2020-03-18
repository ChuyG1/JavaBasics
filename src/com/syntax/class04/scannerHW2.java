package com.syntax.class04;

import java.util.Scanner;

public class scannerHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan=new Scanner (System.in);
		  
		  System.out.println("Enter your name");
		  String name=scan.next();
		  System.out.println("Enter your mobile number");
		  String number=scan.next();
		  System.out.println("Enter your age");
		  int age=scan.nextInt();
		  
		  
		  System.out.println("Your name is "+name+" your age is "+age+" and your mobile number is "
		  		+ ""+number);
		  
		  

	}

}
