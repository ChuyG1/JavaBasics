package com.syntax.class16;

public class MethodsRecap {
	 int getLargestNumber(int[] array) {
		 int largest=array[0];
			
		 for(int i=1; i<array.length; i++) {
			 if(array[i]>largest) {
				 
				 largest=array[i];
			 }
		 }
		 return largest;
	 }
}
