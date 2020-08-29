package com.anik.cts.staticexample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main block");
		
		System.out.println("------------------");
		
		StaticEverything.staticMethod();
		StaticEverything.name = "Anik";
		StaticEverything.num = 17;

		System.out.println(StaticEverything.num + " " + StaticEverything.name);
	}

	static {
		System.out.println("Inside static block");
	}

}
