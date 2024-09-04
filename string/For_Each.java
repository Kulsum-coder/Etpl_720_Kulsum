package com.evergent.corejava.string;

public class For_Each {

	public static void main(String[] args) {
		String str="Java is a programming language";
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		
		}
		for(String w:words) {//for each which accepts only string data
			//type and w is a variable , we can take any variable
			System.out.println(w);
		}

	}

}
