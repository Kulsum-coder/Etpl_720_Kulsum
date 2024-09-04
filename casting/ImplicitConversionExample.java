package com.evergent.corejava.casting;
/*
 Widening Conversion Hierarchy :
byte -> short -> int -> long -> float -> double 

Implicit (Automatic) Type Conversion
Implicit type conversion is also known as widening conversion.
 * 
 */
public class ImplicitConversionExample {
    public static void main(String[] args) {
        int num = 100;     // int is a 32-bit data type
        double dnum = num; // double is a 64-bit data type
        System.out.println("Integer value: " + num);
        System.out.println("Double value (after implicit conversion): " + dnum);
    }
}


