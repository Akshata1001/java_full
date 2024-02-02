package com.abstraction;

public class Swift extends MS{
	
	public void getMillage() {
		System.out.println("80km/hr");
	}
	public  void getColour(){
		System.out.println("White");
	}
	public  void getPrice(){
		System.out.println("8Lakh");
	}
	public  void getFeatures(){
		System.out.println("greate millage, gives safety");
	}
	public void getDealers() {
		System.out.println("Suzuki");
	}
	
	public static void main(String[]args) {
		Swift sw= new Swift();
		sw.CarInfo();
		sw.MsInfo();
		sw.getMillage();
		sw.getColour();
		sw.getPrice();
		sw.getFeatures();
		sw.getDealers();
		
		
	}


}
