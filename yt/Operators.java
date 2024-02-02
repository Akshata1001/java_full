package com.yt;

public class Operators {
	public static void main(String[] args) {
		//assignment operator
		int a=10;
		int b=20;
		
		//arithmetic operator
		int c= a+b;
		int d= b-a;
		int e= b/a;
		int f= a*b;
		int r=b%a;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(r);
		
		//Relational operators
		System.out.println(a>b);
		System.out.println(a<b);
		boolean m= a>b;
		System.out.println(m);
		
		//Bitwise operators
		System.out.println(true&false); //bitwise and //check both
		System.out.println(true|false); //bitwise or //check both
		
		//short circuit operators
		System.out.println(false&&false); // no need to check second
		System.out.println(true||false); // if first is true it dont go to check second 
										//but if first is false then it goes to second
		
		//Ternary operators
	}

}
