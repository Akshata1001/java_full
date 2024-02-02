package com.yt;

public class F {
	static {
		System.out.println("static block");

	}
	{
		System.out.println("non static block");

	}
	F(){
		System.out.println("constructor");

	}

}
