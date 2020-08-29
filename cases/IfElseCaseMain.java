package com.anik.cts.cases;

public class IfElseCaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Anik";
		
		if(name == "Anik")
		{
			System.out.println("Welcome Anik!!");
		}
		else
		{
			System.out.println("Welcome guest!!");
		}
		
		
		String position = "CEO";
		
		if(position == "CEO")
		{
			String name_psoition = "Anik";
			if(name_psoition == "Anik")
			{
				System.out.println("Welcome our CEO: "+name_psoition);
			}
			else
			{
				System.out.println("Welcome our manager: "+name_psoition);
			}
		}
		else
		{
			System.out.println("Welcome guest / client!!");
		}

	}

}
