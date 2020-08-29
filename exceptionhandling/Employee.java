package com.anik.cts.exceptionhandling;

public class Employee {
	
	public int employeeId;
	public String employeeName;
	public double employeeSalary;
	
	
	public Employee(int employeeId, String employeeName, double employeeSalary) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}


	public void calculateTax()
	{
		double tax = this.employeeSalary*0.175;
		System.out.println("Tax to be paid: "+tax);
	}
}
