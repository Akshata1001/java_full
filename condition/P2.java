package com.condition;
import java.util.Scanner;
//marks wise grade 
public class P2 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int m= sc.nextInt();
		//nextInt() is non-static 
		//System is class name and .in here in is static 
		
	if(m>75) {
		System.out.println("Distinction");
	}
	else if (60<m & 75<m) { 
		System.out.println("first claass");
		
	}
	else if(60>m & 50<m) {
		System.out.println("second class");
		
	}
	else if(35<m & 50>m) {
		System.out.println("pass");
	}
	else if(35>m){
		System.out.println("fail");
	}
	}
}
