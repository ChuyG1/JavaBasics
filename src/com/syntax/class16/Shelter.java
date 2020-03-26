package com.syntax.class16;

public class Shelter {
	public static void main(String[] args) {
	//access instance variables
		Dogs puppy=new Dogs();
		puppy.name="Charley";
		System.out.println(puppy.name);
		
		//access static variables of different class
		System.out.println(Dogs.breeds);
		
}
}