package com.inher;

import java.util.Scanner;

public class Tata extends Car{
		public static void getTata() {
			System.out.println("Founded by Ratan Tata\n one of the greatest car company in India ");
		 {
		System.out.println("choose your fav car");
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Altroz");
		System.out.println("2.Safari");
		System.out.println("3.Main menu");

		
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("Altroz");
			Altroz ab= new Altroz();
			ab.getAltroz();
			ab.getTata();
			
			break;
		case 2:
			System.out.println("Safari");
			Safari sa= new Safari();
			sa.getSafari();
			sa.getTata();
			break;
		case 3:
			System.out.println("Main menu");
	
			break;
		
			
	
		}
		}	
	
	}

}
