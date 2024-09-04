package com.evergent.corejava.string;

public class StringDemo2 {
//mutable stores in constant string pool
	
	public static void main(String[] args) {
		String s1="JAVA";//without  any new keyword
		String s2="JAVA";
		if(s1==s2)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
