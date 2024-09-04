package com.evergent.corejava.abstract1;

public class ProductImpl2 extends Product {
	public void newproduct() {
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local method");
	}
	public static void main(String args[]) {
		Product p1=new ProductImpl2();
		//creating object through implement class
	    //p1.show(); we cannont make refernce for 
		//local when we create object for abstract
		p1.newproduct();
		p1.allproducts();
	}

}
