package com.evergent.corejava.collectioframeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class CF12_ArrayList_foreach {

	public static void main(String[] args) {
		ArrayList <Object> al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add("hello");
		System.out.println(al);
		Iterator i1=al.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		for(Object s:al) {
			System.out.println(s);
		}

	}

	}

