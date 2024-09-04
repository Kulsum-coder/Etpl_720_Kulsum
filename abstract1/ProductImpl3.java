package com.evergent.corejava.abstract1;

public class ProductImpl3 extends Product3 {
	public  ProductImpl3() {
		System.out.println("Constructor");
	}
	public void newproduct() {
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local method");
	}
	public static void main(String args[]) {
		Product3 p1=new ProductImpl3();
		//creating object through implement class
	    //p1.show(); we cannont make refernce for 
		//local when we create object for abstract
		p1.newproduct();
		p1.allproducts();
	}

}
