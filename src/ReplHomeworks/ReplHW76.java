package ReplHomeworks;

import java.util.Scanner;

public class ReplHW76 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String D1; String D2; String D3; String D4;
		String D5; String D6; String D7;
		System.out.println("Please enter day 1 of the week");
		D1=scan.nextLine();
		System.out.println("Please enter day 2 of the week");
		D2=scan.nextLine();
		System.out.println("Please enter day 3 of the week");
		D3=scan.nextLine();
		System.out.println("Please enter day 4 of the week");
		D4=scan.nextLine();
		System.out.println("Please enter day 5 of the week");
		D5=scan.nextLine();
		System.out.println("Please enter day 6 of the week");
		D6=scan.nextLine();
		System.out.println("Please enter day 7 of the week");
		D7=scan.nextLine();
		
		String[] array= new String[7];
		array[0]=D1;
		array[1]=D2;
		array[2]=D3;
		array[3]=D4;
		array[4]=D5;
		array[5]=D6;
		array[6]=D7;
		
		for(int I=0; I<=6; I++) {
			System.out.println(array[I]);
		}
		
	}

}
