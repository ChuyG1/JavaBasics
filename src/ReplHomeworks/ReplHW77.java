package ReplHomeworks;

import java.util.Scanner;

public class ReplHW77 {

	public static void main(String[] args) {
	/*Create an array of integers that will store 5
	 *  elements taken from a user
	Don't print any prompt message for the user
	Then print out all the elements you have created 
	in the first loop in reverse order. 
	 */
		Scanner scan= new Scanner(System.in);
		int D1; int D2; int D3; int D4; int D5; 
		System.out.println();
		D1=scan.nextInt();
		System.out.println();
		D2=scan.nextInt();
		System.out.println();
		D3=scan.nextInt();
		System.out.println();
		D4=scan.nextInt();
		System.out.println();
		D5=scan.nextInt();
		

		int[] array= new int[5];
		array[0]=D1;
		array[1]=D2;
		array[2]=D3;
		array[3]=D4;
		array[4]=D5;

		for(int N2=5; N2>0; N2--) {
			System.out.println(N2);
		}
		System.out.println();
	}

}
