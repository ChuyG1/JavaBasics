package ReplHomeworks;

import java.util.Scanner;

public class ReplHW35 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean Yes=true;
		boolean No=false;
		boolean answer=scan.nextBoolean();
		int creditscore;
		
		if (answer==Yes) {
			System.out.println("What is your credit score?");
			creditscore=scan.nextInt();
			if (creditscore<=600) {
				System.out.println("not eligible");
			}else if (creditscore>=600&&creditscore<=700) {
				System.out.println("Maybe eligible");
			}else if (creditscore>=701&&creditscore<=800) {
				System.out.println("Eligible");
			}else if(creditscore>=800) {
				System.out.println("Definitely eligible");
			}
		}else  {
			System.out.println("The elegibility is unknown");
		}
			
		}
	}
