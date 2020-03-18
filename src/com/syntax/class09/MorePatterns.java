package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		for(int i=1; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//Printing 5 rows of numbers 1-9
		for(int N=1; N<5; N++) {
			for(int R=1; R<=9; R++) {
				System.out.print(R);
			}
			System.out.println();
		}
		//printing 5 rows decreasing from 5-1
		for(int N1=1; N1<=5; N1++) {
			for(int R2=5; R2>=1; R2--) {
				System.out.print(R2);
			}
			System.out.println();
		}
		/*printing 5 rows decreasing value per row 
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		for(int N2=5; N2>=1; N2--) {
			for(int R3=5; R3>=1; R3--) {
				System.out.print(N2);
			}
			System.out.println();
	}

}
}
