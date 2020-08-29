package com.anik.cts.runtimepolymorphism;

public class Manager extends Employee {
	
	public Manager(int managerId, String managerName, double managerSalary)
	{
		super(managerId, managerName, managerSalary);
	}
	
	
	
	@Override
	public void calculateTax() 
	{
		double tax = this.employeeSalary*0.375;
		System.out.println("Tax to be paid by manager: "+tax);
	}


    @Override
	public void homeAllowance()
	{
		double homeAllowance = 0.06*super.employeeSalary;
		System.out.println("Home allowance for manager: "+homeAllowance);
	}

}
