package ReplHomeworks;

	class ReplHW137 {
	
	String make="Toyota";
	String model="Prius";
	int numberOfDoors=4;
	int topSpeed=120;
	double price= 30000.0;
	
	ReplHW137(String make,String model, int numberOfDoors, int topSpeed, double price ){
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	ReplHW137(String make, String model, int topSpeed, double price){
		int numberOfDoors=4;
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	ReplHW137(int topSpeed, int numberOfDoors, double price){
		String make="Unknown";
		String model="Unknown";
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	ReplHW137(String make, String model, int numberOfDoors){
		int topSpeed=90;
		double price=0.0;
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
}
 
