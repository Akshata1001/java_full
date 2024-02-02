package com.yt;

public class H{ 
{
	System.out.println("Inside Static block");
}
	public void m1() {
		H ab= new H();
		System.out.println("m1");
		
		
	}
	public static void main(String[] args) {
		H ab = new H();
		ab.m1();
		
	}
}

