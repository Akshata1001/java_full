package com.a;

public class Second {
	public static void main(String[]args) {
		First ft= new First();
		//System.out.println("private "+ft.pvt); private class is not accessible in another class of same package 
		//private is not accessible in another class of another package
		System.out.println("public "+ft.pb);
		System.out.println("default "+ft.def);
		System.out.println("protected "+ft.pr);

}
}