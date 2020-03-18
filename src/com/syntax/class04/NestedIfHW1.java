package com.syntax.class04;

import java.util.Scanner;

public class NestedIfHW1 {

	public static void main(String[] args) {
	
		Scanner Scan=new Scanner(System.in);
		boolean isSunny=true;
		boolean notSunny=false;
		System.out.println("Is it sunny outside?");
		boolean Weather=Scan.nextBoolean(); 
		if(Weather==isSunny){
			System.out.println("It is a sunny day, i should go somewhere");
			System.out.println("What is the temperature");
			
			int Temp=Scan.nextInt();
			if(Temp>85) {
				System.out.println("I am going to the beach!");
			}else {
				System.out.println("i am going ot the park");
			}
			}else {
				System.out.println("I stay home and practice Java");
				
			}
	}

}
