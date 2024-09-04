package com.evergent.corejava.Interface1;

public class BookImpl2 implements Book {
	public void bookTitle() {
		System.out.println("Java book");//Interface methods
	}
	public void bookAuthor() {
		System.out.println("orcale"+cName);
	}
	public void bookPrice() {
		System.out.println("Rs 776");
	}
	public void show() {//local method
		System.out.println("my data");
	}
	public void mynewbook() {
	}
	public void bookgame() {
		
	}
	public static void main(String[] args) {
		//BookImpl2 b2=new BookImpl2();
		Book b1=new BookImpl2();
		b1.bookAuthor();
		b1.bookPrice();
		b1.bookTitle();
		//we cannot create refrence for local class methods
	}

}
