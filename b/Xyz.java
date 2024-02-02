package com.b;

import com.a.*; // we can import all the classes in the package
//import com.a.Wxy or import com.a.Abc as this we can import single class

public class Xyz {
	public static void main(String[] args) {
		Abc obj= new Abc();
		obj.m1();
		Wxy obj2=new Wxy();
		obj2.m3();
		
	}

}
