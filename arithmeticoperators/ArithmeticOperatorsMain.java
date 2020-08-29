package com.anik.cts.arithmeticoperators;

public class ArithmeticOperatorsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 5;
		int c = 0;
		
		c = a+b;
		System.out.println("Sum of two numbers: "+c);
		c = a-b;
		System.out.println("Difference of two numbers: "+c);
		c = a*b;
		System.out.println("Multiplication of two numbers: "+c);
		c = a/b;
		System.out.println("Difference of two numbers: "+c);
		
		int number = 5;
		int power = 2;
		
		int square = (int) Math.pow(number, power);
		System.out.println("Square of "+number+": "+square);
		
		double squareRoot = Math.sqrt(25);
		System.out.println("Square root of 25: "+squareRoot);

	}

}
