package ReplHomeworks;

import java.util.HashMap;
import java.util.Map;

public class ReplHW201 {

	public static void main(String[] args) {
		Map<String, String>MMap=new HashMap<>();
		MMap.put("Street", "Patrick ST");
		MMap.put("Suite", "265");
		MMap.put("City", "Vienna");
		MMap.put("Zip", "22180");
		MMap.put("Country", "United State");
		
		for(Map.Entry me:MMap.entrySet()) {
			System.out.println(me.getValue().toString().toUpperCase());
		}
	}

}
