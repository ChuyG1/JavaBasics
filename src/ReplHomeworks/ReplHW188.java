package ReplHomeworks;

import java.util.LinkedList;
import java.util.List;

public class ReplHW188 {
	
	public void m1() {
		
	}
	public static void main(String[] args) {
		
		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		countries.remove(0);
		countries.remove(5);
		countries.remove(2);
		

		System.out.println(countries);
	}

}
