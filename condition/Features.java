package com.condition;
import java.util.Scanner;

public class Features {
	public static void getTata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Altroz");
		System.out.println("2.harrier");
		int ch=sc.nextInt();
		Tata td= new Tata();
		switch(ch){
		case 1:
			td.getAltrozInfo();
			break;
		case 2:
			td.getSafariInfo();
			break;
		default:
			System.out.println("Invalid choice");
		}
		//go for P4
		
	}

}
