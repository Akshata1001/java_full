package com.yt;

public class Xyz {
	public static void m1() {
		System.out.println("Inside m1");
	}
	public void m2() {
		System.out.println("Inside m1");
		
	}
	public static void main(String [] args){
		Xyz.m1(); //it is static so no need to create object
		//Xyz.m2(); //non-static need to create object
		Xyz obj= new Xyz();
		obj.m1();
		obj.m2();
		
	}

}
