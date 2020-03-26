package ReplHomeworks;

import java.util.Scanner;

public class ReplHW99 {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
	        // convert String to char[] array
	        char[] chars = s.toCharArray();
	 
	        // iterate over char[] array using enhanced for loop
	        for (char ch : chars) {
	            System.out.println(ch);
	        }
	}

}
