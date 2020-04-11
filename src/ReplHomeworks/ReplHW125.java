package ReplHomeworks;

public class ReplHW125 {
	public static String mixString(String s1, String s2) {
		int length1=s1.length();
		int length2=s2.length();
		int max=Math.max(length1, length2);
		String word="";
		
		for(int i=0; i<max; i++) {
			if(i<=length1-1)
				word+=s1.substring(i, i+1);
			if(i<=length2-1)
				word+=s2.substring(i, i+1);
		}
		return word;
	}
	//test case below (dont change):
	public static void main(String[] args){
	  String firstValue = mixString("12345","abcde"); 
		System.out.println(firstValue); 
		String secondValue = mixString("howdy","hello");
		System.out.println(secondValue); 
	}
}
