package com.evergent.corejava.Stack_demo1;
import java.util.Stack;

public class Static_Demo2 {

	public static void main(String[] args) {
		Stack mystack=new Stack();
		mystack.push("red");
		mystack.push("black");
		mystack.push("white");
		System.out.println(mystack);
		mystack.clear();
		boolean b=mystack.isEmpty();
		System.out.println(b);
		System.out.println(mystack);
		System.out.println(mystack.search("green"));
	}

}
