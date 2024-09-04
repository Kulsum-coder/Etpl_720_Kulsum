package com.evergent.corejava.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedDeque11 {
	public static void main(String[] args) {
		Deque <String> pq=new LinkedList<>();
		pq.add("ravi");
		pq.add("bhanu");
		pq.add("shankar");
		System.out.println(pq);
		System.out.println(pq.poll());
		
		
	}

}
