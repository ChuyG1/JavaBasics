package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Johnson"); //comes from collection
		llist.add(0, "Reyes"); //comes from list
		llist.add("Pavel");
		llist.add("Fuck");
		llist.add("Fuck");
		
		int size=llist.size();
		System.out.println(size);
		System.out.println("-------------------------------");
		//get all elements 1 by 1 in 3 different ways
		
		for(String a:llist) {
			System.out.println(a);
		}
		System.out.println("------------------------------");
		for(int i=0;i<llist.size(); i++) {
			String A=llist.get(i);
			System.out.println(A);
		}
		System.out.println("------------------------------");
		Iterator<String> it=llist.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
	}

}
