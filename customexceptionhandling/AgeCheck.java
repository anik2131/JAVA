package com.anik.cts.customexceptionhandling;

public class AgeCheck {
	
	public void validate(int age) throws Exception
	{
		if(age<18)
		{
			throw new Exception("Age below 18..sorry not allowed!!");
		}
		else
		{
			System.out.println("Welcome to movie hall");
		}
	}

}
