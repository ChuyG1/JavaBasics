package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		
		String str1="Welcome Syntax students";
		
		String str2="Welcome Syntax Students";
		
		//to compare 2 strings
		System.out.println("-----equals() equalsignorecase() FUNCTION-----");
		
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home - Syntax Technologies";
		String actual="  Home - Syntax Technologies";
		
		if(actual.equals(expected)) {
			System.out.println("Test case pass. titles are matched");
		}else {
			System.out.println("Test case fails. titles are NOT matched");
		}
		if (actual.trim().equals(expected)) {
			System.out.println("Test case pass. titles are matched");
		}else {
			System.out.println("Test case fails. titles are NOT matched");
		}
		
		String browser="Chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		//OR
		
		if(browser.toLowerCase().equals("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		}
			}


