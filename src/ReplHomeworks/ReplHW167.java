package ReplHomeworks;

public abstract class ReplHW167 {
	
	String teaType;
	
	ReplHW167(String teaType){
		this.teaType=teaType;
	}
	
	public abstract void addSugar();
}
class LemonTea extends ReplHW167{

	LemonTea(String teaType) {
		super(teaType);	
	}
	
	public void addSugar() {
		System.out.println("for "+teaType+" we need 2 spoons of sugar");	
	}
	
}
class ChaiTea extends ReplHW167{

	ChaiTea(String teaType) {
		super(teaType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addSugar() {
		System.out.println("for "+teaType+" we need 1 spoon of sugar");
		
	}
	
}
