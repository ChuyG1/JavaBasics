package ReplHomeworks;

public class ReplHW127 {
	static int countA(String s) {
		String str="";
		char b;
		for(int i=0;i<s.length(); i++) {
			b=s.charAt(i);
			if(b=='A'||b=='a') {
				str=str+s.charAt(i);
			}
		}
		return str.length();
	}
	//test case below (dont change):
		public static void main(String[] args){
			System.out.println(countA("aaA")); //3
			System.out.println(countA("aaBBdf8k3AAadnklA")); //6
		}
}
