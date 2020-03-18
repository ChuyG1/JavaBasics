package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		
	char[] grades= {'A','B','C','D','E','F'};
			//Getting all elements
			for(int i=0; i<grades.length; i++) {
				System.out.print(grades[i]+" ");
			}
	//PRINTING USING ADVANCED LOOP
	for(char grade:grades) {
		System.out.print(grade+" ");
	}
	System.out.println();
	//Create an array of fruits and retrieve all elements
	
	String[] fruits= {"Banana","Kiwi","Apple","Mango"};
	//if fruit is apple--> that is your favorite food
	//Advanced for loop enhanced for loop, for each loop
	
	for(String fruit:fruits) {
		if(fruit.equals("Apple")){
		System.out.println(fruit+" is your favorite fruit");
	}else {
		System.out.println(fruit);
	}
	//regular for loop
	//fruits.length= number of element
	for(int i=0; i<fruits.length; i++) {
		System.out.println(fruits[i]);
	}
	}

	}
}

