package com.encaps;

public class Student {
	int rollNo;
	String name;
	String Dept;
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", Dept=" + Dept + "]";
	}
	
	public static void main(String []args) {
		Student st= new Student();
		st.name= "Akshata";
		st.rollNo = 10;
		st.Dept="CSE";
		System.out.print(st);
		System.out.print(st.name);
		System.out.print(st.rollNo);
		System.out.print(st.Dept);
	//parent class is object 	
	}
	

}
