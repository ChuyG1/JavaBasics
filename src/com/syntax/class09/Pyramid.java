package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {
		/*To make a pyramid the columns can be less or equal to the 
		 * number of rows but can never be more
		 */
		for(int i=1; i<=4; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*Make a pyramid to output
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		for(int R=1; R<=5; R++) {
			
			for(int C=1; C<=R; C++) {
				System.out.print(C+"");
			}
			System.out.println();
		}
		/*Make a pyramid to output
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 */
		for(int R=1; R<=5; R++) {
			
			for(int C=1; C<=R; C++) {
				System.out.print(R+"");
			}
			System.out.println();
	}
		/*Make pyramid to output
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 */
		for(int N2=5; N2>=1; N2--) {
			for(int R3=1; R3<=N2; R3++) {
				System.out.print(N2);
			}
			System.out.println();
}
		/*Print
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		for(int i4=1; i4<=5; i4++) {
			for(int j5=1; j5<=i4; j5++) {
				System.out.print("*"+"");
			}
			System.out.println();
		}
		for(int i5=4; i5>=1; i5--){
			for(int j6=1; j6<=i5; j6++) {
				System.out.print("*"+"");
			}
			System.out.println();
		}
}
}