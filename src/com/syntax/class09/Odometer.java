package com.syntax.class09;

public class Odometer {

	public static void main(String[] args) {
		for(int MI=0; MI<=10; MI++) {
			for(int ThrdI=10; ThrdI<=100; ThrdI++) 
				for(int ScndI=100; ScndI<=1000; ScndI++)
					for(int Outr=1000; Outr<=9999; Outr++) {
						System.out.println(MI+""+ThrdI+""+ScndI+""+Outr);
					}
		
		}
		

	}

}
