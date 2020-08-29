package com.anik.cts.exceptionhandling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 5;

		try {
			System.out.println(num2 / num1);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}

		int arr[] = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array range is out of bound");
		}

		Employee e = null;

		try {
			System.out.println(e);
		} catch (Exception e1) {
			System.out.println("Null value detected");
		}

		finally {
			System.out.println("End of program");
		}
	}

}
