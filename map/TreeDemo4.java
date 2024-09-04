package com.evergent.corejava.map;

import java.util.Map;
import java.util.TreeMap;
public class TreeDemo4 {
	public static void main(String[] args) {
		TreeMap<Integer, String> str=new TreeMap<>();
		str.put(102, "raju");
		str.put(103, "Bhanu");
		str.put(101, "ramu");
		str.put(104, "david");
		System.out.println(str);
		System.out.println("students records sortefd by ID:");
		for(Map.Entry<Integer, String> entry:str.entrySet()) {
			System.out.println("ID:"+entry.getKey()+" Name"+entry.getValue());
			
		}

	}

}
