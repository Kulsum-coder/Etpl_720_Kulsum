package com.evergent.corejava.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo2 {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.add(18);
		pq.add(20);
		pq.add(1);
		pq.add(9);
		System.out.println(pq);
		

	}

}
