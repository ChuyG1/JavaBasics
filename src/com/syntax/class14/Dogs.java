package com.syntax.class14;

public class Dogs {
	
	String breed;
	String color;
	String name;
	int age;
	
	void Eat() {
		System.out.println(name+" can eat");
	}
	void bark() {
		System.out.println(name+" can bark");
	}
	void run() {
		System.out.println(name+" can run");
	}
	public static void main(String[] args) {
	Dogs dog1=new Dogs();
	dog1.breed="Pitbull's";
	dog1.color="Light Brown";
	dog1.name="Pepita";
	dog1.age=2;
	
	dog1.bark();
	dog1.Eat();
	dog1.run();
	
	Dogs dog2=new Dogs();
	dog2.breed="Husky's";
	dog2.color="White";
	dog2.name="Snow";
	dog2.age=10;
	
	dog2.bark();
	dog2.Eat();
	dog2.run();
	
	System.out.println(dog1.breed);
}
	
}