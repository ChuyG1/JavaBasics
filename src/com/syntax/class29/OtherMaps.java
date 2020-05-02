package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		//store student ID & corresponding name
		Map<Integer, String>lmap=new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane Smith");
		lmap.put(1002, "Faisal Sakhi");
		lmap.put(102, "Chuy Garcia");
		
		System.out.println(lmap);
		System.out.println("--------------------------------------------------------");
		//store objects in a form of K and V and you want to srt your keys in ascending order
		Map<Integer, String>tmap=new TreeMap<>();
		tmap.put(1000, "John Smith");
		tmap.put(1001, "Jane Smith");
		tmap.put(1002, "Faisal Sakhi");
		tmap.put(102, "Chuy Garcia");
		System.out.println(tmap);
		
		System.out.println("--------------------------------------------------------");
		//create a map of country and population and sort countries in alphabetical order
		
		Map<String, Integer>pop=new TreeMap<>();
		pop.put("USA", 300000000);
		pop.put("Mexico", 680000000);
		pop.put("Spain", 500000000);
		pop.put("Canada", 230000000);
		
		System.out.println(pop);
	}

}
