package com.evergent.corejava.Stack_demo1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Static_Demo6 {
	public static void main(String[] args){
	Stack<String> mystack=new Stack<>();
	mystack.push("red");
	mystack.push("black");
	mystack.push("white");
	System.out.println(mystack);
	System.out.println("Enumeration");
	Enumeration e= mystack.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		
	}
	System.out.println("Iteratot");
	Iterator i1=mystack.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
	
	
}
}