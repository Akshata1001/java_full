package com.finalkeyword;

public class A {
	int a=10;
	public static void main(String[]args) {
		A obj= new A();
		obj.a=50;
		System.out.println(obj.a);
	}
	
//	final int a=10;
//	public static void main(String[]args) {
//		A obj= new A();
//		obj.a=50;
//		System.out.println(obj.a);
//	}
	
		// we cannot change the value of same variable by using final
	

}
