package ReplHomeworks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReplHW193 {

	public static void main(String[] args) {
		Set<String> SSET=new LinkedHashSet<>();
		SSET.add(null);
		SSET.add("Sohil");
		SSET.add("Diego");
		SSET.add("Alijon");
		SSET.add("Asel");
		SSET.add("Sumair");
		
		for(String A:SSET) {
			System.out.println(A);
		}
		
		Iterator<String>itr=SSET.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
		}

	}

}
