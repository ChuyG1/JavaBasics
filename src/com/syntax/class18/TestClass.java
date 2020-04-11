package com.syntax.class18;

public class TestClass {

		public static void main(String [] args) {
			Dog dog=new Dog();
			//access variables from own class
			dog.breed="Husky";
			//access variables from parent class
			dog.color="Grey";
			dog.fur="Too Much";
			dog.size="Big";
			
			//access method from own class
			dog.bark();
			//access methods from parent class
			dog.beWild();
			dog.eat();
			dog.sleep();
			Dog.age=2;
			Dog.display();
			
			Animlas animal= new Animlas();
			//can access only features defined within its own class
			animal.color="Any";
			animal.size="Any";
			animal.fur="Any";
			
			animal.sleep();
			animal.eat();
			animal.beWild();
		}
}
