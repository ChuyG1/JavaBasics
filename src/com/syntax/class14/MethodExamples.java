package com.syntax.class14;

public class MethodExamples {

	//want to create a method that will be greeting a person
	
	void greet(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void main(String[] args) {
		//how do i call method greet?
		//ClassName variableName=new ClassName();
		MethodExamples object1=new MethodExamples();
		object1.greet("Chuy");
		object1.greet("Angel");
		object1.greet("Pri");
		object1.greet("Emilio");
	}
}
