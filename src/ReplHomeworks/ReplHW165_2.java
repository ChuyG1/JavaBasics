package ReplHomeworks;

public class ReplHW165_2 extends ReplHW165{
	
	@Override
	public void m1() {
		System.out.println("m1 without parameters");
	}

	@Override
	public void m1(String S) {
		System.out.println("m1 method with parameter");
		
	}
	public static void main(String[] args) {
		ReplHW165_2 obj=new ReplHW165_2();
		obj.m1();
		obj.m1("S");

	}

}
