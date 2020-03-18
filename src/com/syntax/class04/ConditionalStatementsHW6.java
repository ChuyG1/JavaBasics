package com.syntax.class04;

import java.util.Scanner;

public class ConditionalStatementsHW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter month Number ");
		  int Month=scan.nextInt();
		  
		  if(Month==1) {
			  System.out.println("January");
		  }if(Month==2) {
			  System.out.println("February");
		  }if(Month==3) {
			  System.out.println("March");
		  }if(Month==4) {
			  System.out.println("April");
		  }if(Month==5) {
			  System.out.println("May");
		  }if(Month==6) {
			  System.out.println("June");
		  }if(Month==7) {
			  System.out.println("July");
		  }if(Month==8) {
			  System.out.println("August");
		  }if(Month==9) {
			  System.out.println("September");
		  }if(Month==10) {
			  System.out.println("October");
		  }if(Month==11) {
			  System.out.println("November");
		  }if(Month==12) {
			  System.out.println("December");
		  }if(Month>=12) {
			  System.out.println("Invalid");
		  }
		
		  
	}

}
