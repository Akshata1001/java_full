package com.condition;

public class B {
	public static void main(String[]args) {
		int a=10;
		while(a<20) {
			//here while condition is false it will show error
			//if here while condition is true it will goes in infinite loop 
			//if here value is 10 to 20 output is 10 to 19
			System.out.println(a);
			a++;
			
			//int i=5;
			//while(++i<30) {
				//here we get output 6,8,10,.....
				//System.out.println(a);
				//i++;
				
				boolean e=true;
				int j=10;
				while(j<20) {
					if(j==15) {
						e=false;
					}else {
						System.out.println(j);
					}
					//j++; it will give output from 11-19 only skip 15
				}
				//j++;// it will goes in infinite loop 
	
			}
		}
			
	}
