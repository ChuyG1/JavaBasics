package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//create an arrayList with names
		ArrayList<String> arrayList=new ArrayList<>();
		
		//adding String object from arrayList
		arrayList.add("John");
		arrayList.add("Chuy");
		
		//access element from array list 
		String secondElement=arrayList.get(1);
		System.out.println(secondElement);
		
		//arrayList is dynamic array
		
		
		
		//how to get number of elements inside arrayList?
		int size=arrayList.size();
		System.out.println(size);
		
		//how to retrieve values from arrayList 1 by 1?
		for(int i=0; i<arrayList.size(); i++) {
			String element=arrayList.get(i);
			System.out.println(element);
		}
		
		
		
		
	}

}
