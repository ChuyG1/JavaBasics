package ReplHomeworks;

import java.util.Scanner;

public class ReplHW38 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean answer=scan.hasNextBoolean();
		
		if(answer==true) {
			System.out.println("Today you will be learning Java");
		} else {
			System.out.println("Today you will be learning Manual testing");
		}

	}

}
