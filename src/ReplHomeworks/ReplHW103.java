package ReplHomeworks;

import com.syntax.class16.Dogs;

public class ReplHW103 {
	String breed;
	String color;
	String name;
	

	void play() {
		System.out.println(breed+" can play");
	}
	void bark() {
		System.out.println(breed+" can bark");
	}
	void run() {
		System.out.println(breed+" can run");
	}
	public static void main(String[] args) {
		ReplHW103 dog1=new ReplHW103();
		dog1.breed="Husky";
		dog1.color="Grey";
		dog1.name="Pepita";
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		ReplHW103 dog2=new ReplHW103();
		dog2.breed="Bulldog";
		dog2.color="White";
		dog2.name="Brian";
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		ReplHW103 dog3=new ReplHW103();
		dog3.breed="Labrador";
		dog3.color="Light Brown";
		dog3.name="Labby";
		
		dog3.bark();
		dog3.run();
		dog3.play();

	}

}
