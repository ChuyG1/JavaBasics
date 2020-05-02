package ReplHomeworks;

public class ReplHW170 implements MyInterface170_2{
	
	@Override
	public void parentMethod() {
		System.out.println("Parent Method-welcome to Syntax");
		
	}

	@Override
	public void childMethod() {
		System.out.println("Child Method-hello Syntax");
		
	}
	public static void main(String[] args) {
		ReplHW170 obj=new ReplHW170();
		obj.parentMethod();
		obj.childMethod();

	}

}
