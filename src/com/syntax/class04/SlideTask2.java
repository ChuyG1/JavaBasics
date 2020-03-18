package com.syntax.class04;

public class SlideTask2 {

	public static void main(String[] args) {
		double mortgageRate=2.5;
		int mortgagePrice=210000;
		
		if (mortgageRate>4.5) {
			System.out.println("Will not buy house");
			
		}else {
			System.out.println("Will consider");
			if (mortgagePrice<200000) {
				System.out.println("Will buy house in cash");
			}else {
				System.out.println("Will take out loan");
			}
		}

	}

}
