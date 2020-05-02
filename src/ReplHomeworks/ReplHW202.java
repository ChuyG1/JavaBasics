package ReplHomeworks;

import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class ReplHW202 {

	public static void main (String hh[]){
	    Map <String,String> ls = new HashMap<>();
	    ls.put("ONE","AAA");
	    ls.put("TWO","BBB");
	    ls.put("THREE", "CCC");
	    ls.put("FOUR","DDD");
	    ls.put("FIVE","EEE");
	    //System.out.println(ls);
	   Set <Entry<String,String>> setls = ls.entrySet();
	   Iterator <Entry<String,String>> it= setls.iterator();
	   System.out.println("HashMap Before Remove :");
	    while(it.hasNext()){
	     Entry<String,String> ss = it.next();
	    System.out.println(ss.getKey()+ " : "+ ss.getValue());
	    }
	    ls.remove("ONE");
	    ls.remove("FOUR");
	    System.out.println("--------------");
	    System.out.println("HashMap After Remove :");
	    for(Entry<String,String> kkk:setls){
	     System.out.println(kkk.getKey()+ " : "+ kkk.getValue());
	    }
	  }
}
