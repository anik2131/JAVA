package com.anik.cts.abstractclass;

public class Ceo extends Employee {

	public Ceo(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
	}
	
	@Override
	public void calculateTax() {
		double tax = 0.37*super.employeeSalary;
		System.out.println("Tax to be paid by CEO: "+tax);
	}

	@Override
	public void calculateHomeAllowance() {
		double homeAllowance = 0.21*super.employeeSalary;
		System.out.println("Home allowance for CEO: "+homeAllowance);
		
	}
}
