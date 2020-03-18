package com.syntax.class08;

public class SlidesTask1 {

	public static void main(String[] args) {
		/*Print numbers from 1 to 50 except those that are divisible by 3
		 * 
		 */
		
		for (int I=1; I<=51; I++) {
			if(I%3==0) {
			continue;
			}
		System.out.println(I);	
		}
		
		
	}

}
