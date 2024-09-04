package com.evergent.corejava.collectioframeworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CF14_ArrayList_HashSet {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("corejava");
		list.add("J2ee");
		list.add("j2se");
		list.add("myjava");
		Set<String>s1=new HashSet<String>();
		s1.addAll(list);

	}

}
