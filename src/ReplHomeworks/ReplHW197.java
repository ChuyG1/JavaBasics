package ReplHomeworks;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReplHW197 {

	public static void main(String[] args) {
			Map<String, String>MMap=new LinkedHashMap<>();
			MMap.put("Street", "Patrick ST");
			MMap.put("Suite", "265");
			MMap.put("City", "Vienna");
			MMap.put("Zip", "22180");
			MMap.put("Country", "United State");
			
			System.out.println(MMap.get("Street"));
			System.out.println(MMap.get("Suite"));
			System.out.println(MMap.get("City"));
			System.out.println(MMap.get("Zip"));
			System.out.println(MMap.get("Country"));
			}
			
	}


