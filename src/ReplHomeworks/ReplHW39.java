package ReplHomeworks;

import java.util.Scanner;

public class ReplHW39 {

	public static void main(String[] args) {
		int mark;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		mark=scan.nextInt();
		
		
		if (mark>80) {
			System.out.println("Your grade is A");
		}else if (mark<=80&&mark>60) {
			System.out.println("Your grade is B");
		}else if (mark<=60&&mark>50) {
			System.out.println("Your grade is C");
		}else if (mark<=50&&mark>45) {
			System.out.println("Your grade is D");
		}else if (mark<=45&&mark>25) {
			System.out.println("Your grade is E");
		}else if (mark<=25&&mark>=1) {
			System.out.println("Your grade is F");
		}else {
			System.out.println("Please enter valid mark");
		}

	}

}
