package ReplHomeworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ReplHW203 {

	public static void main(String[] args) {
		 Map <String,String> ls = new HashMap<>();
		    ls.put("ONE","AAA");
		    ls.put("TWO","BBB");
		    ls.put("THREE", "CCC");
		    ls.put("FOUR","DDD");
		    ls.put("FIVE","EEE");
		    
		    Set <Entry<String,String>> setls = ls.entrySet();
			   Iterator <Entry<String,String>> it= setls.iterator();
			   System.out.println("HashMap Before Replace :");
			   while(it.hasNext()){
				     Entry<String,String> ss = it.next();
				    System.out.println(ss.getKey()+ " : "+ ss.getValue());
				    }
			   System.out.println("------------------");
			   System.out.println("HashMap After Replace");
			   ls.replace("FIVE", "SUMAIR");
			   ls.replace("THREE", "ASEL");
			   for (Entry<String, String> A5:setls) {
				   System.out.println(A5.getKey()+" : "+A5.getValue());
			   }
	}
}
