package com.encaps;
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("press 1 to set data\n press 2 to get data ");
		switch(sc.nextInt()) {
		case 1:
			EmployeeMyApp.setData();
			break;
		case 2:
			EmployeeMyApp.getData();	
			break;
			}
		
	}
}
}
	
	


