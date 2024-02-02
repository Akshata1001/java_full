package com.inher;

import java.util.Scanner;



public class Car {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("choose your fav car company");
		System.out.println("1.Tata");
		System.out.println("2.BMW");
		System.out.println("3.Mahindra");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("welcome to Tata");
			Tata ta = new Tata();
			ta.getTata();
			break;
		case 2:
			System.out.println("welcome to BMW");
			BMW ba = new BMW(); 
			ba.getBMW();
			
			break;
		case 3:
			System.out.println("welcome to Mahindra");
			
			
		
		
		
		
			
		

		}		
		
	
	
	}
}
