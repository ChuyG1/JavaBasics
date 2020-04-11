package ReplHomeworks;

public class ReplHW146 {
	
	ReplHW146(String city){
		System.out.println(city);
	}
	
	ReplHW146(){
		System.out.println("Parent Constructor");
	}
}

class Child extends ReplHW146{
	Child(String city){
	super(city);
	}
}