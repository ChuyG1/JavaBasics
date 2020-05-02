package ReplHomeworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ReplHW199 {

	public static void main(String[] args) {
		Map<String, Integer>MMMAP=new HashMap<>();
		MMMAP.put("mango", 10);
		MMMAP.put("apple", 30);
		MMMAP.put("orange", 20);
		MMMAP.put("mango", 40);
		MMMAP.put("mango", 40);
		
		Set entrySet=MMMAP.entrySet();
		
		Iterator it=entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry me= (Map.Entry)it.next();
			System.out.println("Key = "+me.getKey()+" and value = "+me.getValue());
		}
		
	}

}
