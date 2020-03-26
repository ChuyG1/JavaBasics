package ReplHomeworks;

public class ReplHW102 {
	String carColor;
	int carYear;
	String carMake;
	
	public static void main(String[] args) {
		ReplHW102 car1= new ReplHW102();
		car1.carColor="Black";
		car1.carYear=2019;
		car1.carMake="BMW";
		
		ReplHW102 car2=new ReplHW102();
		car2.carColor="White";
		car2.carYear=2018;
		car2.carMake="Toyota";
		
		System.out.println("car color is "+car1.carColor+" and car year is "+car1.carYear+" and car model is "+car1.carMake);
		System.out.println("car color is "+car2.carColor+" and car year is "+car2.carYear+" and car model is "+car2.carMake);
	}

}
