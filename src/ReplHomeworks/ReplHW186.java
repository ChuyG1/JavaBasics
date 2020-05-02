package ReplHomeworks;

import java.util.LinkedList;

public class ReplHW186 {

	public static void main(String[] args) {
	// prime number
	LinkedList<Integer> ls = new LinkedList<>();
		boolean b = false;
		for (int P = 2; P < 101; P++) {
		for (int i = 2; i < P; i++) {	
			if (P % i == 0) {
			b = true;
				break;	
		}		
	}
			if (!b) {
				ls.add(P);
		}		
			else b = false;	
}
		System.out.println(ls);
	}
}
