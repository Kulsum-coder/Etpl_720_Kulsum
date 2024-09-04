 package com.evergent.corejava.JavaBeans;

public class ProductImpl {
	//retriving the alues from construtor without using again setter method

	public static void main(String[] args) {
		Product p1=new Product(45, "abc", 56778);
		System.out.println("product no:"+p1.getPno());
		System.out.println("product name:"+p1.getPname());
		System.out.println("product price:"+p1.getPrice());
		
		

	}

}
