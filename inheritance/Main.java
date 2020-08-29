package com.anik.cts.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(17, "Anik", 31500.37);
		Manager manager = new Manager(21, "Ayan Ghosh", 100000.97);
		
		employee.calculateTax();
		manager.calculateTax();
		manager.homeAllowance();
	}

}
