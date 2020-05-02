package ReplHomeworks;

public class ReplHW169 implements MyInterfaceRepl169, MyInterfaceRepl169_2  {

	@Override
	public void secondMethod() {
		System.out.println("Second method implementing multiple inheritance");
		
	}

	@Override
	public void firstMethod() {
		System.out.println("First method implementing multiple inheritance");
		
	}
	
	public static void main(String[] args) {
		ReplHW169 obj=new ReplHW169();
		obj.firstMethod();
		obj.secondMethod();

	}


}
