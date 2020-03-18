package ReplHomeworks;

import java.util.Scanner;

public class ReplHW44 {

	public static void main(String[] args) {
		
		 Scanner scan;
		  String favcarmake;
		  String carorigin;
		  
		  scan=new Scanner(System.in);
		  System.out.println("Please enter your favorite  car make");
		  favcarmake=scan.nextLine();
		  
		  switch(favcarmake){
		    
		    case "BMW":
		      carorigin="german car";
		    break;
		    case "Toyota":
		      carorigin="japanese car";
		    break;
		    case "Maserati":
		      carorigin="italian car";
		    break;
		    default:
		    carorigin="unknown";
	}
		  System.out.println("Your favorite car is "+carorigin);
	}
}
