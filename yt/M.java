package com.yt;
//Non-static data is accessible in non-static
//static data is accessible in non-static
//Non-static data is not accessible in static
//static data is accessible in static


public class M {
	//static int a=10;
	  int a=10;
	//public static void m1()		
	public void m1() {
		System.out.println(a);
	}
	public static void main(String []args) {
		M ab= new M();
		ab.m1();
	}

}
