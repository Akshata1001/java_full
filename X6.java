package com.abstraction;

public class X6 extends BMW{
	public void X6Info() {
		System.out.println("X6");
		
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
		X6 bw= new X6();
		bw.CarInfo();
		bw.BMWInfo();
		bw.getMillage();
		bw.getColour();
		bw.getPrice();
		bw.getFeatures();
		bw.getDealers();

}
}
