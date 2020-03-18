package ReplHomeworks;

import java.lang.reflect.Array;

public class ReplHW71 {

	public static void main(String[] args) {
		int[] numbers;
		numbers = new int[] {45,78,12,67,55,89,23,77,88};
		for(int values=0; values<numbers.length; values++) {
			if(values%2==0) {
				System.out.print(numbers[values]+" ");
			}
		}

	}

}