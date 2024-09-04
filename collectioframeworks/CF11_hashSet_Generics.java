package com.evergent.corejava.collectioframeworks;

import java.util.HashSet;
import java.util.Iterator;

public class CF11_hashSet_Generics {

	public static void main(String[] args) {
		//generics for to add same data type
		//generics "object" can add any type of data type
		HashSet <String> hs= new HashSet<>();
		hs.add("hello");
		hs.add("world");
		System.out.println(hs);
		Iterator li=hs.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			
		}
		for(String s:hs) {
			System.out.println(s);
		}
		

	}

}
