package com.yt;

public class Methods {
	int a=10;
	int b=30;
	public void getAddition() {
		System.out.println("Addition is" +(a+b));

	} 
	public void getSubstraction() {
		System.out.println("Substraction is"+(a-b));
		
		
	}
	public void getMultiplication() {
		System.out.println("Multiplication is" +(a*b));

	} 
	public void getDivision() {
		System.out.println("Division is" +(b/a));

	} 
	public void getReminder() {
		System.out.println("Reminder is" +(b%a));

	} 
	 public static void main(String[] args) {
		 Methods obj= new Methods();
		 obj.getAddition();
		 obj.getSubstraction();
		 obj.getMultiplication();
		 obj.getDivision();
		 obj.getReminder();
		 
		 		 
		 
	 }


	
		
	
	// In int,boolean,float need to write return value
}