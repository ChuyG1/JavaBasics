package com.syntax.class18;

public class ConstructorDemo {
	
	static String str="hello";
	
	ConstructorDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	} 
	
	ConstructorDemo(String str){
		System.out.println("i am constructor with 1 string parameter "+str);
	}
	
	ConstructorDemo(int num){
		System.out.println("i am a constructor with 1 integer value "+num);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println(str);
		ConstructorDemo obj1=new ConstructorDemo("today is java class");
		ConstructorDemo obj2=new ConstructorDemo(12);
		

	}

}
