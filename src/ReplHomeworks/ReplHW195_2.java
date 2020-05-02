package ReplHomeworks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReplHW195_2 {

	public static void main(String[] args) {
		Set<ReplHW195>LSet=new LinkedHashSet<>();
		LSet.add(new ReplHW195("John Doe", 123456789, 80000.0));
		LSet.add(new ReplHW195("Jane Smith", 987654321, 90000.0));
		LSet.add(new ReplHW195("Jackie Chan", 0, 100000.0));
		
		Iterator<ReplHW195>itr=LSet.iterator();
		while(itr.hasNext()) {
			Object it=itr.next();
			System.out.println(itr.next().getFullName()+itr.next().getSsn()+itr.next().getSalary());
			System.out.println(it);
		}
	}

}
