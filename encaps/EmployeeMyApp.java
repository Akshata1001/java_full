package com.encaps;

import java.util.Scanner;

public class EmployeeMyApp {
	static Scanner sc = new Scanner(System.in);
	 static Employee emp= new Employee();
	 public static void setData() {
		System.out.println("Enter Employee Id");
		int Id= sc.nextInt();
		emp.setEmpId(Id);
		
		System.out.println("Enter Employee name");
		String Name= sc.next();
		emp.setName(Name);
		
		System.out.println("Enter Employee Salary");
		String Salary= sc.next();
		emp.setSalary(Salary);}
	 
	public static void getData() {
		System.out.println("employee id is" + emp.getEmpId());
		System.out.println("employee name is" + emp.getName());
		System.out.println("employee id is" + emp.getSalary());

	}

}
