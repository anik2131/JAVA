package com.anik.cts.objectclass;

import com.anik.cts.objectcreation.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.employeeId = 17;
		e.employeeName = "Anik";
		e.employeeSalary = 31500.37;
		
		System.out.println(e);
	}

}
