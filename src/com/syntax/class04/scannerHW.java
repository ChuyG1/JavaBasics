package com.syntax.class04;

import java.util.Scanner;

public class scannerHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Please Enter First Name");
		    String first = scan.next();
		    System.out.println(first);
		    
		    System.out.println("Please  Enter Surname");
		    String last = scan.next();
		    System.out.println(last);
		    
		    System.out.println(first+" "+last);
	}

}
