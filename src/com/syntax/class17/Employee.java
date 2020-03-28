package com.syntax.class17;

public class Employee {

	//create variables to hold: name. last name, title, ssn;
	public static String title;
	
	public String name;//accessible anywere
	protected String lastName;//accessible within same package
	double salary;//accessible within same package
	private long ssn;//accessiblevONLY within same class
	
	public static void method1() {
		System.out.println("i am public method");
	}
	
	protected void method2() {
		System.out.println("i am protected method");
	}
	
	void method3() {
		System.out.println("i am default method");
	}
	
	private void method4() {
		System.out.println("i am a private method");
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="John";
		emp.lastName="Smith";
		emp.salary=90000;
		emp.ssn=908676765;
		//acess methods
		emp.method1();
		emp.method2();
		emp.method3();
		
		
		
		
	}
}
