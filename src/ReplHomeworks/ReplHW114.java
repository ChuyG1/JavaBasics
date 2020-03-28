package ReplHomeworks;

public class ReplHW114 {
	
	static void spaceOut() {
		String str="hello";
		char letter;
		for(int i=0; i<str.length(); i++) {
			
			letter=str.charAt(i);
			System.out.print(letter+" ");
		}
		System.out.println();
	}
	
	static void spaceOut1() {
		String str="technology";
		char letter;
		for(int i=0; i<str.length(); i++) {
			
			letter=str.charAt(i);
			System.out.print(letter+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		spaceOut();
		spaceOut1();

	}

}
