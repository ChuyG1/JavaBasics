package ReplHomeworks;

import java.util.HashSet;

public class ReplHW190 {

	public static void main(String[] args) {
		HashSet<String>HSET=new HashSet<String>();
		HSET.add("third");
		HSET.add("first");
		HSET.add("second");
		
		System.out.println(HSET);
		
		HSET.removeAll(HSET);
		
		System.out.println(HSET);

	}

}
