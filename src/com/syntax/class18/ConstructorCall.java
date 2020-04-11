package com.syntax.class18;

public class ConstructorCall {
	
	public ConstructorCall() {
		System.out.println("i am non argument constructor");
	}
	public ConstructorCall(String str) {
		this();
	}
	public ConstructorCall(String str, String str1) {
		this("Hello");
	}
	public static void main(String[] args) {
		ConstructorCall obj = new ConstructorCall();
	}
	
	
}
