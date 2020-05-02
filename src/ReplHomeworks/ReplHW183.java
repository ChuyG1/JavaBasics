package ReplHomeworks;

import java.util.LinkedList;

public class ReplHW183 {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		for(int O=50; O<=100; O++) {
			list.add(O);
			if(O%3!=0) {
				list.remove(O);
			}
			System.out.println(list);
		}
		}
}
