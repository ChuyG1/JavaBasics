package ReplHomeworks;

public class ReplHW75 {

	public static void main(String[] args) {
 /*Using the following array. 
	{45, 78, 12,  67, 55, 89, 23, 77, 88}
	Create a for loop to extract values from
` that array so your output looks as below:
  */
		// output:78 55 77
	//its plus 2, figure out how to 
	//make it output every other number, probs in a if loop
		int[] numbers= {45,78,12,67,55,89,23,77,88};
		for(int I=0; I<numbers.length; I++) {
			int newI=I+2;
			System.out.println(numbers[newI]+" ");	
		
		
	}
	}
}
