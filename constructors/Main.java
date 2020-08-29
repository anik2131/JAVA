package com.anik.cts.constructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeConstructor empDefltConst = new EmployeeConstructor();
		EmployeeConstructor empParConst = new EmployeeConstructor(17, "Anik", 31500.37);
		System.out.println(empDefltConst.employeeId + " " + empDefltConst.employeeName + " " + empDefltConst.employeeSalary);
		System.out.println(empParConst.employeeId + " " + empParConst.employeeName + " " + empParConst.employeeSalary);
	}

}
