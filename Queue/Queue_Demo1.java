package com.evergent.corejava.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo1 {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.add(18);
		pq.add(20);
		pq.add(1);
		pq.add(9);
		pq.clear();
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		

	}

}
