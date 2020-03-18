package com.syntax.class02;

public class SlidesTasks {

	public static void main(String[] args) {

		String name = " Chuy";

		String lastName = " Garcia";

		byte grade = 12;

		String city = "Arlington";

		String state = "Virginia";

		long phoneNumber = 7033109379L;

		city = "Chantilly";
		state = "Colorado";

		System.out.println(city);

		System.out.println("My first name is" + name + " my last name is" + lastName + ".");
		System.out.println("I live in the city of " + city + " in the state of " + state + " and my phone number is "
				+ phoneNumber + ".");

		// PART 2

		double num1 = 19.9;
		double num2 = 9.9;

		double sum1 = num1 + num2;
		double sub1 = num1 - num2;
		double mult1 = num1 * num2;
		double div1 = num1 / num2;

		System.out.println("the sum of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum1);
	 	System.out.println("The Subtraction of 2 numbers " + num1 + " and " + num2 + " is euqal to " + sub1);
		// To find the square of 3.9
		double s = 3.9;
		double s2 = s * s;

		System.out.println("The square of the " + s + " is " + s2);

		// to find the perimeter of
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimiter = 2 * (width + height);

	}

}
