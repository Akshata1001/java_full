package com.a;

public class First {
	private String pvt  ="private";
	// here access specifier then data type and type of access specifier 
	String pb= "public";
	String def= "default";
	protected String pr= "protected";
	
	public static void main(String[]args) {
		First ft= new First();
		System.out.println("private "+ft.pvt);
		System.out.println("public "+ft.pb);
		System.out.println("default "+ft.def);
		System.out.println("protected "+ft.pr);
		// all the statements get executed 
		



		
	}
}
