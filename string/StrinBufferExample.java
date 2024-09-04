package com.evergent.corejava.string;

public class StrinBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello ");
		
		System.out.println("Intial String"+sb);
		
		System.out.println("After appending :"+sb.append("world"));
		System.out.println("after insert:"+sb.insert(2, "hi"));
		System.out.println("after replacing:"+sb.replace(0, 3, "world"));
		System.out.println("after deleting:"+sb.delete(0, 3));
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());

	}

}
