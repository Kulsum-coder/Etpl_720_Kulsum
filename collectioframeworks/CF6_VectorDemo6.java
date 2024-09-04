package com.evergent.corejava.collectioframeworks;

import java.util.Enumeration;
import java.util.Vector;

public class CF6_VectorDemo6 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("hello");
		v.add(100);
		v.add("world");
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}
