package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		
		String school="Syntax";
		String str=new String("Hello");
		String str1="This is string 7676,&^&^";
		
		//how many characters string has
		System.out.println(school.length());
		
		int size=str.length();
		System.out.println("String length is "+size);
		
		//convert string to lowercase or uppercase
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toLowerCase();
		System.out.println(str);
		
		//concatinate 2 strings
		String newString=str+school;
		System.out.println(newString);
		
		String day="Saturday";
		String date="14";
		
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		char grade='A';
		String str2="Student";
		//below code will give ce, since concat is used to
		//attach 1 string to anoyher string
		//grade.concat(grade);
		
		System.out.println("-----isEmpty FUNCTION-----");
		//outputs true is there is no characters inside the string
		//outputs false if there are any characters inside the string 
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("-------trim() FUNCTION ------");
		//removes empty/white space at the beginning and end of the string
		String str4="Welcome to Syntax!   ";
		str4=str4.trim();
		System.out.println("String with no leading or trailig spaces:"+str4);
	}

}
