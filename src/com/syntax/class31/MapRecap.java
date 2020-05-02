package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {

	public static void main(String[] args) {
		Map<String, String> hmap=new HashMap<>();
		hmap.put("USA", "Washington DC");
		hmap.put("Russia", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Italy", null);
		hmap.put(null,  "some value");
		System.out.println(hmap);
		
		//how to get all keys from a map? Keyset(), entryset();
		Set<String> keys=hmap.keySet();
		Iterator<String> it=keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------------");
		Set<Entry<String, String>> entries=hmap.entrySet();
		Iterator<Entry<String , String>> iter=entries.iterator();
		while(iter.hasNext()) {
			String key=iter.next().getKey();
			System.out.println(key);
			System.out.println("------------------------------------------");
			//get npth key and value
			Entry<String, String> entry=iter.next();
			String myEntry=entry.getKey()+entry.getValue();
			System.out.println(myEntry);
		}
		
		//how to get only values from a map? values(); EntrySet();
		Collection<String> values=hmap.values();
		it=values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//lets create a hashtable of countries with capitals
		Map<String, String> htable=new Hashtable<>();
		htable.put("USA", "Washington DC");
		htable.put("Russia", "Moscow");
		htable.put("France", "Paris");
		//htable.put("Italy", null); --> we cannot store null values inside hashtable
		//htable.put(null, "some value"); --> we cannot store null keys inside hashtable
		System.out.println(htable);
		
		//first part of the code
		createMap("city", "Chantilly");
		
		//second part of the code
		createMap("City", "Washington DC");
	}
	
	public static Map<String, String> createMap(String key, String value) {
		Map map=new HashMap<>();
		map.put(key, value);
		return map;
	}

}
