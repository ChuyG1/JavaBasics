package ReplHomeworks;

public class ReplHW153 {
	
	public void m1(int num) {
		System.out.println(num);
	}
	 public void m1(String S) {
		System.out.println(S);
	}
	 public void m1(double D) {
		System.out.println(D);
	}
	public static void main(String[] args) {
	
		ReplHW153 obj=new ReplHW153();
		obj.m1(100);
		obj.m1("Syntax Technologies");
		obj.m1(100.89);
	}

}
