package com.yt;

public class E {
	{
		System.out.println("Non static block");
	}
	public E() {
		System.out.println("constructor");
	}
	static {
		System.out.println("static block");
	}

}
