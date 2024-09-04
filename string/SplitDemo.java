package com.evergent.corejava.string;

public class SplitDemo {

	public static void main(String[] args) {
		String str="Java is a programming language";
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}

	}

}
