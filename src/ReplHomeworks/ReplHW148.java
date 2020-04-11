package ReplHomeworks;

public class ReplHW148 {
	
	ReplHW148(){
		System.out.println("Parent Constructor without argument");
	}
	ReplHW148(int number){
		System.out.println(number);
	}
}
class Child3 extends ReplHW148{
	Child3(){
		System.out.println("Child Constructor without argument");
	}
	Child3(int number){
		super(number);
	}
} 
