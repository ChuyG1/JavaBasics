package ReplHomeworks;

import java.util.HashMap;
import java.util.Map;

public class ReplHW196 {

	public static void main(String[] args) {
		Map<String, String>MMap=new HashMap<>();
		MMap.put("Street", "Patrick ST");
		MMap.put("Suite", "265");
		MMap.put("City", "Vienna");
		MMap.put("Zip", "22180");
		MMap.put("Country", "United State");
		
		System.out.println(MMap.size());
		MMap.remove("Street");
		MMap.remove("Suite");
		MMap.remove("City");
		MMap.remove("Zip");
		MMap.remove("Country");
		
		System.out.println(MMap.size());

	}

}
