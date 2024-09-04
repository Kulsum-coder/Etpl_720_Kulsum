package com.evergent.corejava.map;

import java.util.HashMap;

public class HashMap_Demo3 {
	public static void main(String[] args) {
		HashMap<String,String> c=new HashMap<>();
		c.put("India", "Delhi");
		c.put("USA","washington");
		c.put("France", "Berlin");
		System.out.println(c);
		for(String i:c.keySet()) {
			System.out.println(i);
		}
	}
}
