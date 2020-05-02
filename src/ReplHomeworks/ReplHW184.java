package ReplHomeworks;

import java.util.Iterator;
import java.util.LinkedList;

public class ReplHW184 {

	public static void main(String[] args) {
		LinkedList<Integer>Llist=new LinkedList<>();
		Llist.add(0);
		Llist.add(1);
		Llist.add(1);
		Llist.add(2);
		Llist.add(3);
		Llist.add(5);
		Llist.add(8);
		Llist.add(13);
		Llist.add(21);
		Llist.add(34);
		
		Iterator<Integer>IT=Llist.iterator();
		while(IT.hasNext()){
		Integer ITT=IT.next();
		System.out.print(ITT+" ");
		}
	}

}
