package com.evergent.corejava.map;

import java.util.HashMap;

public class HashMap_Demo1 {

	public static void main(String[] args) {
		HashMap mymap=new HashMap();
		mymap.put(100, "ramesh");
		mymap.put(200,"Abc");
		mymap.put(200,"xyz");
		mymap.put(null, "ghj");
		//null is the value which accepts by hash map
		//it is non synchronized
		//accepts null keys and values
		mymap.put(100, null);
		System.out.println(mymap);

	}

}
