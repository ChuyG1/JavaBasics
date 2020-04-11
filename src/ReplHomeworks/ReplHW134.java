package ReplHomeworks;


public class ReplHW134 {
	static public String maxLength(String[] arr) {
		int maxLength=0;
		String longestString=null;
		for(String str : arr) {
			if(maxLength<str.length()) {
				maxLength=str.length();
				longestString=str;
			}
		}
		return longestString;
		
	}

	public static void main(String[] args) {
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(maxLength(arr));
		//should print "this is long"
	}
}
