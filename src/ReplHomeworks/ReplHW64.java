package ReplHomeworks;

import java.util.Scanner;

public class ReplHW64 {

	public static void main(String[] args) {
/*Write a for loop that will print out a series
 * pf numbers starting at 0 and ending at the
 * doubled value of end(value must be taken from a user),
 * exclusive.		
 */
		int x=0;
		System.out.print("in:");
		Scanner inp=new Scanner(System.in);
		x=inp.nextInt();
		
		for(int inp1=0; inp1<x*2; inp1++) {
			System.out.print(inp1+" ");

	}
	}
}
