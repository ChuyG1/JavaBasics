package ReplHomeworks;

public class ReplHW129 {
	
	static String surround(String s, String search_term) {
		String a="("+search_term+")";
		s=s.replace(search_term, a);
		return s;
		
	}
	//test case below (dont change):
		public static void main(String[] args){
			System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
			System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
		}
}
