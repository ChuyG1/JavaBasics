package com.syntax.class11;

import java.util.Scanner;

public class SlidesTask5 {

	public static void main(String[] args) {
		
		Scanner scan;
		String username;
		String password;
		String confirmedpassword;
		String message;
		scan= new Scanner (System.in);
		System.out.println("Enter your username");
		username=scan.nextLine();
		
		System.out.println("Please enter your password");
		password=scan.nextLine();
		
		
		if(!(username.isEmpty() || password.isEmpty())) {
			
			if(password.length()>=8) {
				
				if(!password.contains(username)) {
					
					System.out.println("Please confrim password");
					confirmedpassword=scan.nextLine();
					
					if(password.equals(confirmedpassword));{
						System.out.println("Your account is created");
					}else {
						System.out.println("Passwords are not matched");
					}
			}else {
			System.out.println("Password is too short");
				}
		}else {
		message = ("Username and password cannot be empty");
		}

	}	


