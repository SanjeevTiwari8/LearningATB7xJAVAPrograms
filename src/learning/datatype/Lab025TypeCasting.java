package learning.datatype;

public class Lab025TypeCasting {
    public static void main(String[] args) {


    // Type Casting - Source and Destination conversion
    // Widening - Implicit, Explicit - lossless
    // Narrowing - Implicit, Explicit(with data type), loss


    // Widening
    byte b=10;
    int a=b; // VALID – Implicit Casting - JVM
    int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

    // Narrowing
    int val = 300;
    //byte b1 = val; // Invalid - Implicit Casting - JVM
    byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);

    // Same type of examples.

    int course = 100;
    float GST = 18.45F;
    float total_price = course+GST;
        System.out.println(total_price);

    //==============================================================
    int course1 = 100;
    float GST1 = 18.45F;
    //int total_price = course+GST; // Implicti Narrowing - JVM
    int total_price1 = course1+(int)GST1; // Explit narrowing - REAL time - money loss
        System.out.println(total_price1);
}}
