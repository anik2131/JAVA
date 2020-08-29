package com.anik.cts.constructors;

public class EmployeeConstructor {
	public int employeeId;
	public String employeeName;
	public double employeeSalary;
	
	public EmployeeConstructor() //default constructor
	{
		super();
	}
	
	public EmployeeConstructor(int employeeId, String employeeName, double employeeSalary) //parameterized constructor
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
}
