package com.anik.cts.collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(17, "Anik");
		map.put(23, "Aman");
		map.put(100, "Avik");
		
		System.out.println(map);
		
		System.out.println(map.get(17));
		
		for(Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println(entry.getValue()+"  "+entry.getKey());
		}
	}

}
