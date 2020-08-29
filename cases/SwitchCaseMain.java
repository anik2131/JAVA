package com.anik.cts.cases;

import java.util.Scanner;

public class SwitchCaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key: ");
		int i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println("You have pressed: " + i);
			break;
		case 2:
			System.out.println("You have pressed:" + i);
			break;
		case 3:
			System.out.println("You have pressed:" + i);
			break;
		default:
			System.out.println("Enter a valid key!!");
		}
		sc.close();
	}

}
