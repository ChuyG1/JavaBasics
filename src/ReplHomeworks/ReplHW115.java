package ReplHomeworks;

public class ReplHW115 {
	static void censorLetter() {
		String str="Computer Science";
		String newString=str.replace("e"," " );
		System.out.println(newString);
	}
	static void censorLetter1() {
		String str="trick or treat";
		String newString1=str.replace("t"," " );
		System.out.println(newString1);
	}
	public static void main(String[] args) {
		censorLetter();
		censorLetter1();
		

	}

}
