package com.anik.cts.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(10);
		
		System.out.println(hashSet); //removes duplicate values
		
		System.out.println(hashSet.contains(new HashSet<Integer>().addAll(Arrays.asList(20,40,10,30))));
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.remove(70));
		System.out.println(hashSet.hashCode());
		System.out.println(hashSet);
		System.out.println(hashSet.equals(new HashSet<Integer>().addAll(Arrays.asList(20,40,10,30))));

	}

}
