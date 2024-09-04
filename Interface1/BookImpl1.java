package com.evergent.corejava.Interface1;

public class BookImpl1 implements Book {
	public void bookTitle() {
		System.out.println("Java book");//Interface methods
	}
	public void bookAuthor() {
		System.out.println("orcale");
	}
	public void bookPrice() {
		System.out.println("Rs 776");
	}
	public void show() {//local method
		System.out.println("my data");
	}
	public void bookgame() {
		
	}
	public void mynewbook() {
		
	}
	public static void main(String[] args) {
		BookImpl1 b1=new BookImpl1();
		b1.bookAuthor();
		b1.bookPrice();
		b1.bookTitle();
		b1.show();
	}

}
