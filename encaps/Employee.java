package com.encaps;

public class Employee {
	private int empId;
	//	private int empId; for setter method

	private String Name;
	private String Salary;
	
	public void setEmpId(int empId) {
		this.empId= empId;  //setter method
		
			//here empId will be assigned globally the first one this.empId to global data
			// and second one to local int empId
			// empId=empId will be assigned to local empId only 	
	}
	public int getEmpId() {
		return empId;  //getter method 
	}
	
	
	public void setName(String Name) {
		this.Name= Name;  //setter method
	}
	public String getName() {
		return Name;  //getter method 
	}
	
	
	public void setSalary(String Designation) {
		this.Salary= Salary;  //setter method
	}
	
	public String getSalary() {
		return Salary;  //getter method 
	}
//	public static void main(String[]args) {
//		Employee emp= new Employee();
//		emp.setEmpId(10);
//		emp.setName("ABC");
//		emp.setDesignation("AK");
//	System.out.println(emp.getEmpId());//for getter
	//	System.out.println(empId); for setter
//	System.out.println(emp.getName());
//	System.out.println(emp.getSalary());

		
		
	}
	

