package com.evergent.corejava.exceptionhandling;

	class ProductNotFoundException extends Exception{
		public ProductNotFoundException (String message) {
			System.out.println("Hello:"+message);
		}
	}

	public class ProductImpl{
			int pno=105;
			public void myData()throws ProductNotFoundException {
				if(pno>100) 
					throw new ProductNotFoundException("available products");
				else
					System.out.println("no products");
			}
			
		

		public static void main(String[] args) {
			try {
				ProductImpl product1=new ProductImpl();
			product1.myData();
			}
		
			catch(ProductNotFoundException e) {
				System.out.println(e);
			}
			
		}
	}
	 

