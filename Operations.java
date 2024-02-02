package com.abstraction;

import java.util.Scanner;

public class Operations {

	             public static void getAltroz() {
	            	 Altroz a = new Altroz();
	            	 a.getDealers();
	        	     a.TataInfo();
	        	 	 a.getMillage();
	            	 a.getColour();
	            	 a.getPrice();
	            	 a.getFeatures();
	             }
	             
	            
	             
	             
	           
	             
	             
	             public static void getSwift() {
	            	 Swift s = new Swift();
	            	 s.getDealers();
	        	     s.getClass();
	        	 	 s.getMillage();
	            	 s.getColour();
	            	 s.getPrice();
	            	 s.getFeatures();
	             }
	             
	             
	             public static void getX5(){
	            	 X5 x1 = new X5();
	            	 x1.getDealers();
	        	     x1.BMWInfo();
	        	 	 x1.getMillage();
	            	 x1.getColour();
	            	 x1.getPrice();
	            	 x1.getFeatures();
	             }
	             
	             
	             
	             public static void getX6() {
	            	 X6 x2 = new X6();
	            	 x2.getDealers();
	        	     x2.X6Info();
	        	 	 x2.getMillage();
	            	 x2.getColour();
	            	 x2.getPrice();
	            	 x2.getFeatures();
	          
	             }	 
	             
	             
	             
	             
	             
	     		
	            	 
	            	 
	          public static void main(String args[]) {
	        	  int count = 0;
	        	  while(count<3) {
	        	  System.out.println( );
	        	  System.out.println("welcome to car world");
	        	  System.out.println("choose your favorite Company:");
	        	  System.out.println("press 1 for Maruti Suzuki \npress 2 for Tata  \npress 3 for Bmw ");
	        	  Scanner sc = new Scanner(System.in);
	        	  int ch = sc.nextInt();
	        	  switch(ch){
	        	  case 1:
	        		  System.out.println("press 1 for Swift \npress 2 for Baleno ");
	        		  int n1 = sc.nextInt();
	        		  if(n1==1) {
	        			  getSwift();
	        		  }
	        		  else {
	        			  
	        		  }
	        		  break;
	        		  
	        	  case 2:
	        		  System.out.println("press 1 for Altroz \npress 2 for Safari ");
	        		  int n2 = sc.nextInt();
	        		  if(n2==1) {
	        			  getAltroz();
	        		  }
	        		  else {
	        			  ;
	        		  }
	        		  break;
	        	  case 3:
	        		  System.out.println("press 1 for X5 \npress 2 for X6 ");
	        		  int n3 = sc.nextInt();
	        		  if(n3==1) {
	        			  getX5();
	        		  }
	        		  else {
	        			  getX6();
	        		  }
	        		  break;
	        	  default:
	        		  System.out.println("Invalid Choice");	  
	        	  }
	        	  count++;
	        	  }
	          }
	             
	          } 
	                   




