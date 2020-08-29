package com.anik.cts.typeconversions;

import java.util.Arrays;

public class TypeConversionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		double b = (int)a;
		
		String s = Integer.toString(a);
		
		String s1 = "Anik";
		char c[] = s1.toCharArray();
		
		s1 = "10";
		a = Integer.parseInt(s1);
		
		s1 = "31.25";
		b = Double.parseDouble(s1);
		
		Arrays.sort(c);
		System.out.println(c);
	}

}
