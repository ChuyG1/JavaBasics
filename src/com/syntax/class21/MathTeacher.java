package com.syntax.class21;

public class MathTeacher extends Teacher {
	
	public MathTeacher(String name, String lastName) {
		//super(); compiler will make call implicitly if you don't first
		super(name, lastName);
		System.out.println("i am child constructor");
	}
}
