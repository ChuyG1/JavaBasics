package ReplHomeworks;

import java.util.HashSet;

public class ReplHW189 {

	public static void main(String[] args) {
		HashSet<Integer>HSet=new HashSet<Integer>();
		HSet.add(111);
		HSet.add(111);
		HSet.add(111);
		HSet.add(999);
		HSet.add(999);
		HSet.add(999);
		
		for(int I:HSet) {
			System.out.println(I);
		}
	}

}
