package com.evergent.corejava.collectioframeworks;

import java.util.LinkedHashSet;

public class CF13_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> li=new LinkedHashSet<>();
		//adding elements
		li.add("mango");
		li.add("orange");
		li.add("grapes");
		//printing the above elements
		System.out.println("linkedhashset:"+li);
		//printing by using for each loop
		for(String fruit:li) {
			System.out.println(fruit);
			
		}
		//checking the respective element is present or not
		System.out.println("contains banana:"+li.contains("banana"));
		//removing an element
		li.remove("orange");
		System.out.println(li);
		//clearing of elements
		li.clear();
		System.out.println(li);
		
		
		
	}

}
