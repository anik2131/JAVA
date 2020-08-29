package com.anik.cts.abstractclass;

public class Associate extends Employee{

	public Associate(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
	}

	@Override
	public void calculateTax() {
		double tax = 0.17*super.employeeSalary;
		System.out.println("Tax to be paid by Associates: "+tax);
	}

	@Override
	public void calculateHomeAllowance() {
		double homeAllowance = 0.02*super.employeeSalary;
		System.out.println("Home allowance for associates: "+homeAllowance);
		
	}

}
