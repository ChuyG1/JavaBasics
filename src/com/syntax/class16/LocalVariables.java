package com.syntax.class16;

public class LocalVariables {
	void nameInside() {
	
		String name="John";//local variable thats only visible within method
	}
	
	void anotherName="Jane";
	
	public static void main(String[] args) {
		
	//System.out.println(name);CE: name wont be visible to another method
	//since its only within the nameInside method
		LocalVariables obj=new LocalVariables();
		obj.nameInside();
		
		
		
		boolean flag=true;
		
		if(flag) {
			String answer="Yes";
			
	//System.out.println(answer)CE: scope of variable is only visible within the method
		}
		
	}
}
