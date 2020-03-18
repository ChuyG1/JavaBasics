package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {
		// to find the sum of odd numbers and the sum of even numbers
		
		int evensum1=0;
		int oddssum2=0;
		
		for(int O=1; O<99; O++) {
			if(O%2==0) {
				evensum1=evensum1+O;
			}else {
				oddssum2=oddssum2+O;
			}
			System.out.println(evensum1);
		}
		System.out.println("The sume of evens ="+evensum1);
		System.out.println("The sum of odds ="+oddssum2);
	}

}
