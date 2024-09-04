package com.evergent.corejava.collectioframeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class CF10_ArrayListGenerics {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<>();
		al.add(100);
		al.add(200);
		System.out.println(al);
		Iterator i1=al.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		for(Integer s:al) {
			System.out.println(s);
		}

	}

}
