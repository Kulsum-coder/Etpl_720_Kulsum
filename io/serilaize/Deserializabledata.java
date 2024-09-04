package com.evergent.corejava.io.serilaize;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializabledata {

	public static void main(String[] args) {
		
		  try {
			  Product  p=new Product();
			 // FileInputStream fis= new FileInputStream("product.txt");
			  FileInputStream fis= new FileInputStream("C:\\\\mydata\\\\myinfo");
			  
			  ObjectInputStream ois=new ObjectInputStream(fis);
			  
			  while((p=(Product)ois.readObject())!=null){				  
				  
				  System.out.println("Product Data :"+p.getPid()+p.getPname()+p.getPrice());
				  
			  }
			  
			  
		  }
		catch(Exception e) {
			System.out.println("End of the file");
		}
	}

}
