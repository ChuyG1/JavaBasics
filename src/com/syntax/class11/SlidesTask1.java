package com.syntax.class11;

public class SlidesTask1 {

	public static void main(String[] args) {
		String[][] Cars={
				{"Ford","Chevy","Tesla"},
				{"BMW","Voklswagon","Zonda"},
				{"Kwawasaki","Toyota"},
				{"Ferrari","Lamborghini",},
		};
		for(String[] make:Cars) {
			for(String FavCar:make){
				System.out.println(FavCar+" ");
			}
			System.out.println();
		}
	}

}
