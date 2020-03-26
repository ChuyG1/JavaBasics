package ReplHomeworks;

import java.util.Scanner;

public class ReplHW97 {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine();
		    givenString=givenString.replaceAll("[^A-Za-z]", "").replaceAll(" ", "").toLowerCase();
		    String reverse="";
		    
		    for(int i=givenString.length()-1; i>=0; i--) {
		    	reverse=reverse+givenString.charAt(i);
		    }
		    if(givenString.equalsIgnoreCase(reverse)) {
		    	System.out.println("True");
		    }else {
		    	System.out.println("False");
		    }
	}

}
