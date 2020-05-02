package ReplHomeworks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReplHW194_2 {

	public static void main(String[] args) {
		Set<ReplHW194> SSSET=new LinkedHashSet<>();
		SSSET.add(new ReplHW194("Samir", "Jawaid", 101));
		SSSET.add(new ReplHW194("Asel", "Umuzakova", 102));
		SSSET.add(new ReplHW194("Diego", "Juarez", 103));
		SSSET.add(new ReplHW194("Sohil", "Aryan", 104));
		SSSET.add(new ReplHW194("Alijon", "Navaroz", 105));
		
		
		Iterator<ReplHW194>it=SSSET.iterator();
		while(it.hasNext()) {
			it.next().display();
		}
		}
	}


