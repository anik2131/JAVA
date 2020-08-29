package com.anik.cts.inheritance;

public class Manager extends Employee {
	
	public Manager(int managerId, String managerName, double managerSalary)
	{
		super(managerId, managerName, managerSalary);
	}
	
	public void homeAllowance()
	{
		double homeAllowance = 0.06*super.employeeSalary;
		System.out.println("Home allowance for manager: "+homeAllowance);
	}

}
