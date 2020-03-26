package com.syntax.class17;

public class StaticKeyword {
	
	//ceate a template for a phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchscreen;
	
	//return type, name, parameters
	static void displayGeneralInfo() {
		System.out.println("We are building "+brand+" with touch screen="+touchscreen);
	}
	
	void displaySpecifications() {
		System.out.println("We build phone with "+memory+"GB memeory in "+color+" color");
		
	}
	
	public static void main(String[] args) {
		//accessing static variables in a static way
		brand="iPhone";
		touchscreen=true;
		
		//accessing instance variables through the instance of the class
		StaticKeyword obj=new StaticKeyword();
		obj.color="grey";
		obj.memory=64;
		
		//accessing static method in a static way
		displayGeneralInfo();
		
		//accessing static method in a non static way/through instance
		obj.displayGeneralInfo();//valid but not preferrable 
		obj.displaySpecifications();
		
		
	}
	
	
	
}
