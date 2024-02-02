package com.condition;
import java.util.Scanner;


public class P3 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose option");
		System.out.println("Addition");
		System.out.println("Substraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		int ch=sc.nextInt();
		
		System.out.println("Enter num1");
		int num1= sc.nextInt();
		System.out.println("Enter num2");
		int num2= sc.nextInt();
		
		
		switch(ch){
		case 1:
			System.out.println("addition is"+(num1+num2));
			break;
		case 2:
			System.out.println("substraction is"+(num2-num1));
			break;
		case 3:
			System.out.println("multiplication is"+(num1*num2));
			break;
		case 4:
			System.out.println("substraction is"+(num2/num1));
			break;
		default:

			System.out.println("invalid");
		



		


		

		}	
	}
	

}
