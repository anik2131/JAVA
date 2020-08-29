package com.anik.cts.arrays;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5};
		System.out.println(arr);
		
		int arr1[] = new int [5];
		
		for(int i=0;i<5;i++)
		{
			arr1[i] = i+1;
		}
		System.out.println(arr1.hashCode());
		System.out.println(arr1.equals(2));
		System.out.println(arr1.toString());
		System.out.println(arr1.getClass());
		System.out.println(arr1.length);	
	}

}
