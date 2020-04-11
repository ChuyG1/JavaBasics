package com.syntax.class20;

public class Doctor {
	
	int doctorID;
	String name;
	public Doctor(String name, int doctorID) {
		this.name=name;
		this.doctorID=doctorID;
	}
}
class Dentist extends Doctor{
	Dentist(String name, int doctorID){
		//compiler will try to make a call to parent class constructor super();
		super(name, doctorID);
	}
}
