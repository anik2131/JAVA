package com.anik.cts.abstractclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee associate = new Associate(17, "Anik", 31500.37);
		Employee manager = new Manager(23, "Aman", 100000.97);
		Employee ceo = new Ceo(100, "Avik", 350000.12);

		associate.calculateTax();
		associate.calculateHomeAllowance();
		System.out.println("--------------------");
		manager.calculateTax();
		manager.calculateHomeAllowance();
		System.out.println("--------------------");
		ceo.calculateTax();
		ceo.calculateHomeAllowance();
	}

}
