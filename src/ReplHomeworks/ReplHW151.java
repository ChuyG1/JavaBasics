package ReplHomeworks;

public class ReplHW151 {
	
	public void m1() {
		System.out.println("m1 method in parent class");
	}
}
class Child4 extends ReplHW151{
	
	public void m1() {
		System.out.println("m1 method in child class");
	}
	
	public void m2() {
		m1();
		super.m1();
	}
}
