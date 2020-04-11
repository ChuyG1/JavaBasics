package com.syntax.class18;

public class BestCar {

	String make, model, color;
	int year, door, wheels;
	
	BestCar(String carMake, String carModel, String carColor, int carYear, int carDoor, int carWheels){
	make=carMake;
	model=carModel;
	color=carColor;
	year=carYear;
	door=carDoor;
	wheels=carWheels;
	}
	public void printDetails() {
		System.out.println("i have "+year+" "+make+" "+model+" in "+color+" color ");
		
	}

}
