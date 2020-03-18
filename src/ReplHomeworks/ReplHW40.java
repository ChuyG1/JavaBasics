package ReplHomeworks;

import java.util.Scanner;

public class ReplHW40 {

	public static void main(String[] args) {
		 Scanner scan;
		  String instructor;
		  String responsibility;
		  
		  scan=new Scanner(System.in);
		  System.out.println("Enter name of the instructor");
		  instructor=scan.nextLine();
		  
		  switch(instructor){
		    
		    case "Shiva":
		      responsibility="Will take care of Java Assignment";
		    break;
		    case "Sandish":
		      responsibility="Will take care of SDLC Assignment";
		    break;
		    case "Weqas":
		      responsibility="Will take care of Selenium Assignment";
		    break;
		    case "Asel":
		      responsibility="Will take care of every Assignment";
		      break;
		    default:
		    responsibility="Invalid instructor selected";
		  }

		System.out.println(responsibility);

		

	}

}
