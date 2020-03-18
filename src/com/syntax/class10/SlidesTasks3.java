package com.syntax.class10;

public class SlidesTasks3 {

	public static void main(String[] args) {
		String[] countries= {"USA","France","Germany","Poland","Spain"};
		for(int y=0; y<countries.length; y++) {
			switch(countries[y]) {
			
			case "USA":
			System.out.println("The capital is Washington DC");
			break;
			case "France":
			System.out.println("The capital is Paris");
			break;
			case "Germany":
			System.out.println("The capital is Berlin");
			break;
			case "Poland":
			System.out.println("The capital is Warsaw");
			break;
			}
		}
		

	}

}
