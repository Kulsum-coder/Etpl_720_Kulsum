package com.evergent.corejava.wrapperclass;
public class WrapperClassDemo2 {
	public static void main(String[] args) {
		float f1=22f;
		Float f2= new Float(f1);
		float f3=f2.floatValue();
		double d1= 333.44;
		Double d2=new Double(d1);
		double d3=d2.doubleValue();
		byte b1=10;
		Byte b2=new Byte(b1);
		byte b3=b2.byteValue();
		System.out.println("float value:"+f1);
		System.out.println("float object"+f2);
		System.out.println("convert object"+f3);
		
		System.out.println("double value"+d1);
		System.out.println("double object"+d2);
		System.out.println("convert double"+d3);
		
		System.out.println("byte value"+b1);
		System.out.println("byte object"+b2);
		System.out.println("convert byte"+b3);
	}

}