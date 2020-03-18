package ReplHomeworks;

import java.util.Scanner;

public class ReplHW41 {

	public static void main(String[] args) {
		int age;
		String actualage;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age of the child");
		age=scan.nextInt();
		
		switch(age) {
		
		case 1:
			actualage="You can Crawl";
			break;
		case 2:
			actualage="You can Talk";
			break;
		case 3: 
			actualage="You can Dance";
			break;
		case 4:
			actualage="You can get trouble";
			break;
			default:
				actualage="I dont know how old you are";
		
		}
		System.out.println(actualage);

	}

}
