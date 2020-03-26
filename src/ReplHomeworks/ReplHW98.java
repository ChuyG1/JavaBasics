package ReplHomeworks;

import java.util.Scanner;

public class ReplHW98 {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    String NW= "";
		    //write your code below
		   for (int i = 0; i < word.length(); i += 2){
			NW += word.charAt(i);
		}
		   System.out.println(NW);
	}

}
