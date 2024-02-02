package com.b;

import com.a.First;

public class Fourth extends First {
	public static void main(String[]args) {
		Fourth fb= new Fourth();
		//System.out.println("private "+fb.pvt);
		//System.out.println("public "+fb.pb);
		//System.out.println("default "+fb.def);
		System.out.println("protected "+fb.pr);//here only protected is accessible 
		//here we extended the class first from another package a 
		//and also created child class object or same class object 

}
}