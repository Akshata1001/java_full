package com.yt;

public class Data {
	static {
		System.out.println("Inside static block");
	}
	
	public static void main(String [] args) {
		System.out.println("Inside main method");

	}// where there is both static block and main method
	// here in output we can see first static block will execute and then main method will execute 

}
