package com.syntax.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {
		
		String me="I am a good tester";
		System.out.println("----replace() FUNCTION------");
		
		String newString=me.replace("a", "c");
		System.out.println(newString);
		//if it finds matching char sequence--> then replace 
		me=me.replace("good", "great");
		System.out.println(me);
		//if it is not finding matching sequence-->not replace
		me=me.replace("great", "Awesome");
		System.out.println(me);
		
		String car="I have a toyota";
		car=car.replace("Toyota", "Lexus");
		System.out.println(car);
		
		System.out.println("----replaceALL() FUNCTION----");
		
		String str="Phone number is 1234567890";
		System.out.println(str);
		str=str.replaceAll("[A-Za-z]", "");
		
		System.out.println(str);
		
		String str1="Hello12347**&&* !!!89";
		str1.replaceAll("[0-9", "");
		System.out.println(str1);
		
		str1=str1.replaceAll("[A-Za-z]", "");
		System.out.println(str1);
		
		String str2="Hello123^&^&^&*^!";
		str2=str2.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str2);
		
		String str3="hello all students";
		str3.replace(" ", "");
		System.out.println(str3);
		
		String subjects="Java";
		subjects=subjects.replace("a","e").replace("J", "I").toUpperCase();
		System.out.println(subjects);
		System.out.println(subjects.replaceFirst("E", "g"));
				
	}

}
