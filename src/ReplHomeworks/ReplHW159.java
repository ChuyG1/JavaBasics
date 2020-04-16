package ReplHomeworks;

public class ReplHW159 {
	
	public void hello() {
		System.out.println("method in Parent class");
	}
}
class Child8 extends ReplHW159{
	
	public void hello() {
		System.out.println("method in Child1 class");
	}
}
class Child9 extends Child8{
	
	public void hello() {
		System.out.println("method in Child2 class");
	}
}
class Child10 extends Child9{
	
	public void hello() {
		System.out.println("method in Child3 class");
	}
}