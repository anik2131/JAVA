package com.anik.cts.loops;

public class DoWhileLoopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		do
		{
			i++;
			System.out.println("Value of increasing i: "+i);
		}
		while(i<10);
		
		System.out.println("---------------------------");
		
		do
		{
			System.out.println("Value of decreasing i: "+i);
			i--;
		}
		while(i>=0);
	}

}
