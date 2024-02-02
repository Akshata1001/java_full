package com.abstraction;

public class Altroz extends Tata {
	public void getMillage() {
		System.out.println("90km/hr");
	}
	public  void getColour(){
		System.out.println("White");
	}
	public  void getPrice(){
		System.out.println("10 Lakh");
	}
	public  void getFeatures(){
		System.out.println("most popular in India, greate millage, gives safety");
	}
	public void getDealers() {
		System.out.println("TATA");
	}
	
	public static void main(String[]args) {
		Altroz al= new Altroz();
		al.CarInfo();
		al.TataInfo();
		al.getMillage();
		al.getColour();
		al.getPrice();
		al.getFeatures();
		al.getDealers();
		
		
	}

}
