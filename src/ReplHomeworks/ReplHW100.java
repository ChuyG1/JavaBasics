package ReplHomeworks;

import java.util.Scanner;

public class ReplHW100 {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
			char[] chars = s.toCharArray();
			 
	        // iterate over char[] array using enhanced for loop
	        for (char ch : chars) {
	            System.out.print(ch+" ");
	        }

	}

}
