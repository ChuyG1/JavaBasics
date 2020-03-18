package ReplHomeworks;

import java.util.Scanner;

public class ReplHW42 {

	public static void main(String[] args) {
		int rollnumber;
		String studentname;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the roll number of the child");
		rollnumber=scan.nextInt();
		
		switch(rollnumber) {
		
		case 101:
			studentname="Student name: Ramesh";
			break;
		case 102:
			studentname="Student name: Mahesh";
			break;
		case 103: 
			studentname="Student name: Mukesh";
			break;
			default:
				studentname="Not found Student name: in Class";
		
		}
		System.out.println(studentname );


	}

}
