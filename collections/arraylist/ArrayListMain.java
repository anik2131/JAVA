package com.anik.cts.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(30);
		System.out.println(arrayList);
		arrayList.addAll(1, new ArrayList<Integer>(Arrays.asList(40,50,60)));
		System.out.println(arrayList);
		arrayList.remove(2);
		System.out.println(arrayList);
		System.out.println(arrayList.contains(20));
		System.out.println(arrayList.equals(arrayList));
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.hashCode());
		System.out.println(arrayList.lastIndexOf(30));
		System.out.println(arrayList.indexOf(30));
		
		Iterator<Integer> it = arrayList.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
