package com.anik.cts.objectclass;

public class Employee extends Object {
	
	public int employeeId;
	public String employeeName;
	public double employeeSalary;
	
	public Employee(int employeeId, String employeeName, double employeeSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() 
	{
		return ("[ "+this.employeeId+", "+this.employeeName+", "+this.employeeSalary+" ]");
	}	
}
