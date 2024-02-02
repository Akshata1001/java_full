package com.poly;

public class J1 {
	J1(int a){
		System.out.println("Constructor");
	}		
		//it will show error at object creation 
		//it will override the default constructor 
		//so here we have to create one default constructor to remove error
	J1(){
		
	}
		//here J1() is default constructor we have created  
	public void m1() {
		System.out.println(" inside m1");
		
	}
	public static void main(String[]args) {
		J1 obj= new J1();
		obj.m1();
	}
}

		//to check constructor overloading 
		//here we can see constructor can be overload