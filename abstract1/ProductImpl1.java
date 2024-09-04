package com.evergent.corejava.abstract1;

public class ProductImpl1 extends Product {
	public void newproduct() {
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local method");
	}
	public static void main(String args[]) {
		ProductImpl1 p1=new ProductImpl1();
		//creating object through implement class
	    p1.show();
		p1.newproduct();
		p1.allproducts();
	}

}
