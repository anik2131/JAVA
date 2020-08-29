package com.anik.cts.runtimepolymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(21, "Aman", 31500.37);
		Employee manager = new Manager(17, "Anik", 315000.37);
		
		employee.calculateTax();
		employee.homeAllowance();
		System.out.println("-----------------");
		manager.calculateTax();
		manager.homeAllowance();
	}

}
