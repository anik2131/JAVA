package com.anik.cts.abstractclass;

public abstract class Employee {
	public int employeeId;
	public String employeeName;
	public double employeeSalary;
	
	
	public Employee(int employeeId, String employeeName, double employeeSalary) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public abstract void calculateTax();
	public abstract void calculateHomeAllowance();
	
}
