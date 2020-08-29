package com.anik.cts.userinput;

import java.util.Scanner;

public class UserInputScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Number entered is: " + num);
		sc.nextLine();
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("The string entered is: " + s);
		// accordingly for long float double char
		System.out.println("Enter a character: ");
		char c = sc.nextLine().charAt(0);
		System.out.println("Character entered is: " + c);
		sc.close();
	}

}
