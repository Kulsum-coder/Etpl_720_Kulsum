package com.evergent.corejava.string;

public class ContainsSubstring {

	public static void main(String[] args) {
		String str="The quick brown ooofox jumps over the lazy dog ";
		String substr="fox";
		boolean contains=str.contains(substr);
		System.out.println("contains " + substr+":"+contains);
	}

}
