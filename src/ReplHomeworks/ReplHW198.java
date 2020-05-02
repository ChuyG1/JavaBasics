package ReplHomeworks;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ReplHW198 {

	public static void main(String[] args) {
		Map<String, String>MAP=new TreeMap<>();
		MAP.put("1 item", "apple");
		MAP.put("2 item", "banana");
		MAP.put("3 item", "pear");
		MAP.put("4 item", "tomato");
		MAP.put("5 item", "mango");
		MAP.put("6 item", "kiwi");
		
		
		Set<Entry<String, String>>entries=MAP.entrySet();
		
		for(Entry e:entries) {
			System.out.println("Key is "+e.getKey()+" and values is "+e.getValue());
		}
	}

}
