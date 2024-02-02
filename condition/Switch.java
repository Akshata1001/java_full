package com.condition;
// we cannot take same value for case like case5 and case 1+4
public class Switch {
	public static void main (String[]args) {
		int a= 10;
		switch(a){
		case 1:
			System.out.println("inside case 1");
			break;
		case 2:
			System.out.println("inside case 2");
			break;
		default:
			System.out.println("inside default");
		}
			
		// here it matches with the case and gives output
		// if there is no similar case it will gives output as default
		//
			
			int j= 10;
			//switch(j){
		//	case 4+1:
				System.out.println("inside case 1");
		//	break;
		//	case 5:
		//		System.out.println("inside case 2");
		//	break;
		//	default:
				System.out.println("inside default");
				// as we can see here for same value it gives error as duplicate case
				
				int e= 10;
				switch(e){
				case 1+4:
					System.out.println("inside case 1");
					break;
				case 2:
					System.out.println("inside case 2");
					break;
				default:
					System.out.println("inside default");
					
					
					int m= 10;
					switch(m){
					case 1:
						System.out.println("inside case 1");
						
					case 2:
						System.out.println("inside case 2");
						
					default:
						System.out.println("inside default");

						//if we dont give break all the statements we get executed which satisfies condition
						
					
		}

	}
			}
	}

		
