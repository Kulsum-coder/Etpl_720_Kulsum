package com.evergent.corejava.string;

public class ReversString {

	public static void main(String[] args) { 
		String str="hello world";
		StringBuilder reversed =new StringBuilder(str).reverse();
		System.out.println(reversed);
	}

}
