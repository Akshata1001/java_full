package com.poly;

public class First {
	public void m1() {
		System.out.println("no parameter");
	}
	public void m1(int a) {
		System.out.println("int parameter");
	}
	public void m1(int a, int b) {
		System.out.println("int 1, int2  parameter");
	}
	public void m1(float a) {
		System.out.println("float parameter");
	}

	//we can overload static method 
	//overloading(compile time polymorphism)- same fuction name with different parameters
	//same function name , different parameters
	//it does not needs inheritance 
	//we can do overloading by  overloading
	// not compulsory to use inheritance 


	public static void main(String[] args) {
		First f= new First();
		f.m1();
		f.m1(10,20);
		f.m1(30);
		f.m1(2.3f);
		
	
	}

}
