package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//Arrays are fixed in size
		
		String[] students=new String[3];
		students[0]="Hassnsa";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aaron";--> during run time java machine will give 
		//Arrayoutofboundsexception
		//System.out.println(students[3];
		
		String[] inClassstudents=new String[5];
		inClassstudents[0]="Hichem";
		inClassstudents[1]="Tetteh";
		
		System.out.println(inClassstudents[2]);
	}

}
