package com.poly;

public class Abhishek extends Prashant {
	public void getOranges() {
		System.out.println("oranges by Abhishek");
	}
		//we can not override static method
		//inheritance is compulsory in overriding
		//child class is having same method/function name as parent class
		//here child class overrides the data of parent class
		//it gives output of child class only not parent class
	    //overriding needs inheritance, same function name, same parameters 
		// we cannot do overriding in constructor
		public static void main(String[]args) {
			Abhishek ab= new Abhishek();
			ab.getOranges();
			
		}
	}


