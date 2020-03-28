package com.syntax.class17;

public class AccessingMembersOfClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Chuy";
		emp.lastName="Garcia";
		emp.salary=100000;
		//emp.ssn=656746767;CE: field ssn is not visible
		
		Employee.method1();
		emp.method2();
		emp.method3();
	}

}
