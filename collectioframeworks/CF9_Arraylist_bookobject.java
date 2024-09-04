package com.evergent.corejava.collectioframeworks;

import java.util.ArrayList;

class book{
	String name;
	public book(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
public class CF9_Arraylist_bookobject {
	public static void main(String[] args) {
		book b1=new book("core java");
		book b2=new book("Let us  c");
		
		ArrayList ml=new ArrayList();
		ml.add(b1);
		ml.add(b2);
		System.out.println(ml);

	}

}
