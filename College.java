package com.abstraction;

public abstract class College {
	//1.abstract class
	//abstract means unimplemented
	//we can not create object of abstract class because abstract class is having unimplemented methods
	
	public void className() {
		System.out.println("F.Y");//only this will give 0%
	}
	public abstract void getDep();// only this will give 100% 
									// and both will give 50
	
	//we have to create abstract function for unimplemented method 
	//it is having 0-100% accuracy 
	// abstract needs to be unimplemented
	//achieved by two ways--1. By using abstract class-0to 100 % accuracy 
						 //2. by using interfaces- 100% accuracy
	
	public abstract void getTeacherName();
	

	
}	//abstract method  

