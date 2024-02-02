package com.inher;

import java.util.Scanner;

public class BMW {
	public static void getBMW() {
		System.out.println("Most popular\n one of the greatest car company in India ");
		System.out.println("choose your fav car");
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Altroz");
		System.out.println("2.Safari");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("X5");
			X5 ab= new X5();
			ab.getX5();
			ab.getBMW();
			
			break;
		case 2:
			System.out.println("X6");
			X6 sa= new X6();
			sa.getBMW();
			sa.getSX6();
			
			break;
			
		}
}
}
