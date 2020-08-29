package com.anik.cts.customexceptionhandling;

public class CustomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeCheck ageCheck = new AgeCheck();

		try {
			ageCheck.validate(17);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Enjoy your day");
		}
	}

}
