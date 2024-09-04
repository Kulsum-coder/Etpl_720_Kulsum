package com.evergent.corejava.map;

import java.util.Hashtable;

public class HashTable_Demo2 {

	public static void main(String[] args) {
		System.out.println("hi");
		Hashtable mymap=new Hashtable<>();
		mymap.put(100, "ramesh");
		mymap.put(200,"Abc");
		mymap.put(200,"xyz");
		//hash table wont accepts null keys and values 
		//it shows compile time error
		//it is synchronous
		mymap.put(null, "ghj");
		System.out.println(mymap);
		

	}

}
