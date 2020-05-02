package ReplHomeworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReplHW182 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<>(num);
		for(int i=0; i<num; i++) {
			list.add(scan.nextInt());
		}
		
		Iterator<Integer> itr=list.iterator();{
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
		}

	}

}
