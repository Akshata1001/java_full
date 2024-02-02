package com.condition;

import java.util.Scanner;

public class P4 {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("choose your fav car company");
		System.out.println("1.Tata");
		System.out.println("2.Toyata");
		System.out.println("3.Mahindra");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("welcome to my Tata");
			Features.getTata();
			break;
		case 2:
			System.out.println("welcome to my Toyata");
			break;
		case 3:
			System.out.println("welcome to my Mahindra");
			break;
		
		
		}
		
		
		
		
		
		

}
}
