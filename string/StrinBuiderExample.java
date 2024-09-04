package com.evergent.corejava.string;

public class StrinBuiderExample {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("hello ");
		
		System.out.println("Intial String"+sb);
		
		System.out.println("After appending :"+sb.append("world"));
		System.out.println("after insert:"+sb.insert(2, "hi"));
		System.out.println("after replacing:"+sb.replace(0, 3, "world"));
		System.out.println("after deleting:"+sb.delete(0, 3));
		
	}

}
