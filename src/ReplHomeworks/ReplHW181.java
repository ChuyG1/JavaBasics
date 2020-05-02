package ReplHomeworks;

import java.util.ArrayList;

public class ReplHW181 {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("hi");
		arrayList.add("yo");
		arrayList.add("sup");
		arrayList.add("yolo");
		arrayList.add("boop");
		
		arrayList.remove(0);
		arrayList.remove(1);
		arrayList.remove(2);
		
		System.out.print(arrayList);
	}

}
