package com.abstraction;

public class X5 extends BMW {
	public void X5Info() {
		System.out.println("X5");
		
	}
	
	public void getMillage() {
		System.out.println("95km/hr");
	}
	public  void getColour(){
		System.out.println("Black");
	}
	public  void getPrice(){
		System.out.println("15 Lakh");
	}
	public  void getFeatures(){
		System.out.println("greate millage, gives safety");
	}
	public void getDealers() {
		System.out.println("BMW");
	}
	
	public static void main(String[]args) {
		X5 bw= new X5();
		bw.CarInfo();
		bw.BMWInfo();
		bw.getMillage();
		bw.getColour();
		bw.getPrice();
		bw.getFeatures();
		bw.getDealers();
		
		
	}

}
