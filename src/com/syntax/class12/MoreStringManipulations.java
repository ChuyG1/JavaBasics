package com.syntax.class12;

public class MoreStringManipulations {

	public static void main(String[] args) {
		//to get  substring from a given string
		//substring =string inside u=your string
		String str="Today is a rainy day";
		str.substring(6);
		
		String partialstring=str.substring(6);//start from 6 until the endof string
		System.out.println(partialstring);
		
		//rainy day
		partialstring=str.substring(11);
		System.out.println(partialstring);
		
		//today
		partialstring=str.substring(0, 5);//start at 0 end at index 5
		System.out.println(partialstring);
		
		//rainy
		partialstring=str.substring(11, 16);
		System.out.println(partialstring);
	}

}
