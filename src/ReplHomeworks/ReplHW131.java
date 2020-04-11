package ReplHomeworks;

public class ReplHW131 {
	static private String name="John";
	String city="Miami";
	static protected String NOS="Syntax";
	static public int batch=6;
	static void displaySent() {
		ReplHW131 obj=new ReplHW131();
		System.out.println("My name is "+name+" and i live in "+obj.city+"."+" I study at "+NOS+" in batch "+batch);
	}
	public static void main(String[] args) {
		displaySent();

	}

}
