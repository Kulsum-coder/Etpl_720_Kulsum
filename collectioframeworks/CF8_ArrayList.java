package com.evergent.corejava.collectioframeworks;

import java.util.ArrayList;
import java.util.LinkedList;

public class CF8_ArrayList {

	public static void main(String[] args) {
		ArrayList  mylist=new ArrayList();
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
