package com.syntax.class16;

public class InstanceVariables {
	String name="John";// instance variable
	
	public static void main(String[] args) {
		
		String name="Chuy";// Local variable
		
		InstanceVariables object=new InstanceVariables();
		System.out.println(object.name);
		
		object.name="Angel";
		System.out.println(name);
		System.out.println(object.name);
		
		//change value of local variable
		name="Frank";
		System.out.println(name);
	}
	
}
