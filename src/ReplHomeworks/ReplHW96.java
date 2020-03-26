package ReplHomeworks;

import java.util.Scanner;

public class ReplHW96 {
	//how to print a string value reversed/backwards
	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    String reverse="";
		    
		    for(int i=s.length()-1; i>=0; i--) {
		    	reverse=reverse+s.charAt(i);
		    }
		    System.out.println(reverse);
	}

}
