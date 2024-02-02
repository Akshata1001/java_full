package com.yt;
//if static block and main method are in same class static block executes first
//if static block is from another class then first main method will execute and then static block gets executed
public class S {
	//static block from different class execute by creating object of that class
	//first static block gets executed
	public void m1() {
		R obj= new R();
		
	}
	public static void main(String[] args) {
		S obj= new S();
		obj.m1();
		System.out.println("Inside main method");
		//after static block main method gets executed
	}
}
