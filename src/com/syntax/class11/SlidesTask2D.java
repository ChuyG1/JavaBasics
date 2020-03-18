package com.syntax.class11;

public class SlidesTask2D {

	public static void main(String[] args) {
		String [][] countries={
			{"USA", "Mexico","Canada"},
			{"Brazil","Argentina","Colombia"},
			{"Italy","Spain","France"},
			{"China","Japan","South Korea"},
			{"South africa","Congo","Libia"},
		};
		for(String[] places:countries){
			for(String CR:places) {
				System.out.println(CR+" ");
			}
			System.out.println();
		}
		

	}

}
