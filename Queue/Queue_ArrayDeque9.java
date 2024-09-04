package com.evergent.corejava.Queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque9 {

	public static void main(String[] args) {
		ArrayDeque <String> pq=new ArrayDeque<>();
		pq.add("banana");
		pq.addFirst("pineapple");
		pq.add("watermelon");
		pq.addLast("papaya");
		pq.add("apple");
		pq.offerLast("mango");
		System.out.println(pq.peek());
		boolean t=pq.isEmpty();
		System.out.println(t);
		pq.clear();
		System.out.println(pq);
		

	}

}
