package com.inheritance;
//this is multi-level inheritance
//here yash having the fruits from abhishek and abhishek is having the fruits from prashant
//here yash is child of abhishek so it is having properties of abhishek only he does not know about prashant

public class NeedyPerson {
	public static void main(String[]args) {
		Yash yt= new Yash();
		yt.setOrange();
		yt.setMango();
		yt.setCherry();
		
		Abhishek ab= new Abhishek();
		ab.setOrange();
		ab.setMango();
		//ab.cherry(); not gonna execute 
		
		Prashant pt= new Prashant();
		pt.setOrange();
		//pt.setMango();not gonna execute
		//pt.setCherry();not gonna execute
		}

}
