package ReplHomeworks;

import java.util.Scanner;

public class ReplHW65 {

	public static void main(String[] args) {
/*Write a loop that will print out a series of numbers
 *  starting at one less than x and ending at 0.
 */
			int x=0;
			System.out.print("in:");
			Scanner inp=new Scanner(System.in);
			x=inp.nextInt();
			
			for(int inp1=x-1; inp1>=0; inp1--) {
				System.out.print(inp1+" ");
	}
		}
}
