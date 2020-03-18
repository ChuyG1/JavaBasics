package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		System.out.println("----split FUNCTION----");
		
		String today="Today is my favorite java class";
		String [] array=today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite java class";
		String[] stringArray=today1.split("a");
		//print all elments from array 1 by 1
		for(String arr:stringArray) {
			System.out.print(arr+" ");
			
		//we want to print string word by word 
		String today2="Today is my favprite java class";
		String[] words=today2.split(" ");
		
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println("-----------------------");
		
		String today3="Today is my favorite java class";
		today3=today3.trim();
		System.out.println("String after trimming:"+today3);
		
		today3.split("");
		
		
		}

	}

}
