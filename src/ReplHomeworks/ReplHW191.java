package ReplHomeworks;

import java.util.HashSet;
import java.util.Set;

public class ReplHW191 {

	public static void main(String[] args) {
		Set<String> sSet=new HashSet<>();
		sSet.add("Red");
		sSet.add("Pink");
		sSet.add("Yellow");
		sSet.add("White");
		sSet.add("Black");
		
		System.out.println("Original Hash Set: "+sSet);
		System.out.println("Size of the Hash Set: "+sSet.size());
	}

}
