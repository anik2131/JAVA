package com.anik.cts.abstractclass;

public class Manager extends Employee {

	public Manager(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
	}
	
	@Override
	public void calculateTax() {
		double tax = 0.27*super.employeeSalary;
		System.out.println("Tax to be paid by Managers: "+tax);
	}

	@Override
	public void calculateHomeAllowance() {
		double homeAllowance = 0.06*super.employeeSalary;
		System.out.println("Home allowance for managers: "+homeAllowance);
		
	}

}
