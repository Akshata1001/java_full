package com.yt;

public class Fone {
	public static void main(String[] args) {
		F obj= new F();
		F obj2= new F();
		//calling constructor, static and non static in another class
		//executes 1.static, 2.non static, 3.constructor 
		
		//when we have two object the static block will get executed only for first object
		//the non static and constructor block get executed as no of objects
	}


}
