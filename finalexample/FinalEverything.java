package com.anik.cts.finalexample;

public final class FinalEverything // final class can't be extended 
{
	
	public final int num = 17;
	public final String name  = "Anik";
	
	public final void show() //final method can't be overriden
	{
		System.out.println(this.num+" "+this.name);
	}

}
