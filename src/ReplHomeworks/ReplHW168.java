package ReplHomeworks;

public class ReplHW168 implements MyInterfaceRepl168 {

	@Override
	public void m1() {
		System.out.println("implementation of method1");
		
	}

	@Override
	public void m2() {
		System.out.println("implementation of method2");
		
	}
	
	public static void main(String[] args) {
		ReplHW168 obj=new ReplHW168();
		obj.m1();
		obj.m2();

	}

}
