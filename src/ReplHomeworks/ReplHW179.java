package ReplHomeworks;

import java.util.ArrayList;

public class ReplHW179 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(111);
		arrayList.add(111);
		arrayList.add(111);
		arrayList.add(999);
		arrayList.add(999);
		arrayList.add(999);

		for(int i=0; i<arrayList.size(); i++) {
			Integer element=arrayList.get(i);
			System.out.println(element);
		}
	}

}
