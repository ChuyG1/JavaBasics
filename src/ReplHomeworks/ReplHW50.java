package ReplHomeworks;

public class ReplHW50 {

	public static void main(String[] args) {
		/*Step 1: Initialize the i value as int
		 * i=7.
		 * Step 2: Write a program to print a 
		 * sequence of numbers starting from 7
		 * to 98.
		 */
		
		//Easier and faster way to do it
		int i=7;
		while(i<=98) {
			if(i%7==0)
				System.out.println(i);
				i++;
			}
		System.out.println("---------------------");
	
		/*This is another way to achieve the same thing 
		with a few extra steps
		*/
		int number = 7;
		int count2 = 98;      
		while (number <= count2){
		  if(number%7==0)
		System.out.println(number);
		number++;
		
		}
		}
		
}

