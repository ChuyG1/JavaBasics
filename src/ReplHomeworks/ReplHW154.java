package ReplHomeworks;

public class ReplHW154 {
	
	private void m1() {
		System.out.println("private method m1");
	}
	
	private void m1(int I) {
		System.out.println("private method with int parameter");
	}
	public static void main(String[] args) {
		ReplHW154 obj=new ReplHW154();
		obj.m1();
		obj.m1(1);

	}

}
