package ReplHomeworks;

public class ReplHW144 {
	
	String name;
	String lastName;
	int age;
	
}

class Employee extends ReplHW144{
	String name="Joe";
	String lastName="Smith";
	int age=35;
	int salary=35000;
	public void A() {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}	
}

class Student extends Employee{
		String name="Adam";
		String lastName="Smith";
		int age=15;
		int grade=10;
		public void B() {
			System.out.println(name+" "+lastName+" "+age+" "+grade);
		}
}

class Retiree extends Student{
	String name="Frank";
	String lastName="Smith";
	int age=15;
	String seniorActivity="tour";
	public void C() {
		System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
	}
}
