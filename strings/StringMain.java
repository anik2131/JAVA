package com.anik.cts.strings;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Anik";
		System.out.println(string);
		System.out.println(string.endsWith("ik"));
		System.out.println(string.compareTo("Anik"));
		System.out.println(string.equals("AnikC"));
		System.out.println(string.substring(2));
		System.out.println(string.concat(" Chakraborty"));
		System.out.println(string.charAt(2));
		System.out.println(string.hashCode());
		System.out.println(string.contains("An"));
		System.out.println(string.equalsIgnoreCase("anik"));
		System.out.println(string.toLowerCase()+" "+string.toUpperCase());
		string+="ch";
		System.out.println(string);
	}

}
