package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {

	public static void main(String[] args) {
		
		//lets create an Arraylist of chocolate
		
		ArrayList<String> choco=new ArrayList<>();
		choco.add("Hershey");
		choco.add("KIT-KAT");
		choco.add("godiva");
		choco.add("linett");
		
		//create arrayList of sweets 
		
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);
		
		System.out.println(sweets.size());
		System.out.println("--------------------------");
		System.out.println(sweets);
		
		System.out.println("-----------------------");
		
		//we want to iterate through the collection
		Iterator<String> it=sweets.iterator();
		//iterates in 1 direction
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
		System.out.println("---------------------------");
		
		//i want to get elements backwards
		for(int i=sweets.size()-1; i>=0; i--) {
			System.out.print(sweets.get(i)+";");
		}
		

		//advanced for loop
		//iterates in 1 direction
		for(String str:sweets) {
			System.out.println(str);
		}
	}

}
