package ReplHomeworks;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReplHW200 {

	public static void main(String[] args) {
		Map<String, String>MMap=new LinkedHashMap<>();
		MMap.put("Street", "Patrick ST");
		MMap.put("Suite", "265");
		MMap.put("City", "Vienna");
		MMap.put("Zip", "22180");
		MMap.put("Country", "United State");
		
		for(Map.Entry me:MMap.entrySet()) {
			System.out.println(me.getValue());
		}

	}

}
