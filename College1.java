package com.abstraction;

public class College1 extends College {
	//public abstract class College1 extends College(we can use abstract class)
	
	public void getDep() {
		System.out.println("CSE");
		
	}
	public void getTeacherName() {
		System.out.println("abc");
		
	}
	public static void main(String[]args){
		College1 co= new College1();
		co.className();
		co.getDep();
		co.getTeacherName();
		
		
		
	}
	//here we have to use the keyword abstract before class or
	//we can do method overriding 
	

}
