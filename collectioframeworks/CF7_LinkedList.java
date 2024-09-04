package com.evergent.corejava.collectioframeworks;

import java.util.LinkedList;

public class CF7_LinkedList {

	public static void main(String[] args) {
		LinkedList mylist=new LinkedList();
		mylist.add("tata");
		mylist.add("bmw");
		mylist.add("volvo");
		System.out.println(mylist);
		mylist.remove(2);
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);
		
		

	}

}
