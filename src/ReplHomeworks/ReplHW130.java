package ReplHomeworks;

public class ReplHW130 {
	
	private static void privateMethod() {
		System.out.println("This is Private Method");
	}
	String S="This is Default Method";
	
	protected static void protectedMethod() {
		System.out.println("This is Protected Method");
	}
	public static void publicMethod() {
		System.out.println("This is Public Method");
	}
	public static void main(String[] args) {
		privateMethod();
		ReplHW130 obj=new ReplHW130();
		System.out.println(obj.S);
		protectedMethod();
		publicMethod();

	}

}
