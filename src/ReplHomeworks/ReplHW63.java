package ReplHomeworks;

import java.util.Scanner;

public class ReplHW63 {

	public static void main(String[] args) {
/*Write a for loop that will print out a series of numbers 
 * starting at 0 and ending at the x(value must be taken
 * from user), exclusive.		
 */
		int x=0;
		System.out.print("in:");
		Scanner inp=new Scanner(System.in);
		x=inp.nextInt();
		
		for(int inp1=0; inp1<x; inp1++) {
			System.out.println(inp1);
		}
	}

}
