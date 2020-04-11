package com.syntax.class21;

public class Parent {
	
	String name="chuy";
	String lastName="Garcia";
	void Hello() {
		System.out.println("i am a parent class");
	}
}
class Child extends Parent{
	
	String name="Adela";
	
	public void display() {
		System.out.println("name");
		System.out.println("lastName");
		System.out.println(super.name);
	}
	void sayHello() {
		display();
		Hello();
	}
}
