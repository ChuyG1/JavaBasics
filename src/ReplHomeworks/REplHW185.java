package ReplHomeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class REplHW185 {

	public static void main(String[] args) {
		
		ArrayList<Boolean>listA=new ArrayList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		ArrayList<Boolean>listB=new ArrayList<>();
		listB.addAll(listA);
		
		Iterator<Boolean> it=listB.iterator();
		while(it.hasNext()) {
			boolean element=it.next();
			System.out.println(element);
		}
	}

}
