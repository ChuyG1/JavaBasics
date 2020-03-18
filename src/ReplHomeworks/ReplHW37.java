package ReplHomeworks;

import java.util.Scanner;

public class ReplHW37 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean answer1=scan.nextBoolean();
		System.out.println("Are you sleepy");
		boolean answer2=scan.nextBoolean();
		
		if (answer1==true&&answer2==true) {
			System.out.println("Looks like you need to drink Coffee");
		}else if (answer1==true&&answer2==false) {
			System.out.println("Looks like you need to drink Water");
		}else if (answer1==false&&answer2==true) {
			System.out.println("Looks like you need to drink Tea");
		} else {
			System.out.println("Nothing");
		}
				  	
	}
	
}
