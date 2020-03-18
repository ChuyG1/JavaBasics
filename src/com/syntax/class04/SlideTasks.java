package com.syntax.class04;

public class SlideTasks {

	public static void main(String[] args) {
		boolean hasDiploma=true;
		double GPA=2.8;
		
		if (hasDiploma) {
			System.out.println("Congragulations");
			
		if (GPA>3.1) {
			System.out.println("You are eligible for a scholarship");
		}else if (GPA<3.1){
			System.out.println("You should have studied harder");
		}
		}else {
			System.out.println("You should get a degree");
		}

	}

}
