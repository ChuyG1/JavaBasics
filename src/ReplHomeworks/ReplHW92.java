package ReplHomeworks;

import java.util.Scanner;

public class ReplHW92 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input a word");
		String str=scan.nextLine();
		String F3L=str.substring(0, 3);
		System.out.println("The first 3 letters of the word "+str+" "+"is "+F3L);
		
		
	}

}
