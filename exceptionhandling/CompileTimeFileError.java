package com.evergent.corejava.exceptionhandling;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;


public class CompileTimeFileError {

	public static  void main(String[] args) {
		try {
			File file =new File("C:\\Users\\kulsum.shaik\\Documents\\myfile");
			Scanner sc=new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		
			catch(FileNotFoundException e) {
				System.out.println(e);
			}
		
		
		

	}

}
