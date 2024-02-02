package com.yt;

public class OperatorsOne {
		public static void main(String[] args) {
			int a=10;
			int b=a--;
			System.out.println(a);
			System.out.println(b);
			
			int e=a--+b++;
			System.out.println(e);
			
			int x=10;
			int y=x++;
			System.out.println(x);
			System.out.println(y);
			
			int g=10;
			int h=++g;
			System.out.println(g);
			System.out.println(h);
			
			int t=10;
			int s=--t;
			System.out.println(t);
			System.out.println(s);
			
			System.out.println(30+40+40+"xyz"+"abc"+10+20); //left to right move 
															//left to the string get added but after getting string in middle the right part considered as string 
			
			

			
		}

	}



