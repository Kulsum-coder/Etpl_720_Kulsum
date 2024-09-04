package com.evergent.corejava.io.serilaize;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ProductSerlizable {
	
	public static void main(String[] args) {
		try {
		FileOutputStream fos =new FileOutputStream("C:\\mydata\\myinfo");		
			//FileOutputStream fos =new FileOutputStream("product1.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			Product p1=new Product(100, "mouse",5000);
			Product p2=new Product(100, "mouse",5000);
			
			oos.writeObject(p1);
			oos.writeObject(p2);

			System.out.println("Write Object into product.txt");
			
			oos.close();
			
		}
		catch(Exception e) {
			System.out.println("I can handle :"+e);
		}
	}

}
