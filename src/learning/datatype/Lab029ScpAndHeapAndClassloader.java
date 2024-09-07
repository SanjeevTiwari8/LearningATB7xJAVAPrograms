package learning.datatype;

public class Lab029ScpAndHeapAndClassloader {
    public static void main(String[] args) {


    String name = "Sanjeev"; // Assignment Operators
    String name2 = new String("Sanjeev"); // New Operator

    // Both of them, actually save the name, name2 in different ways JVM
    // How they store the values in the JVM?


    // SCP (String constant pool) and Heap - JVM
        //SCP example
        String s1 = "Sanjeevone";
        // 1 , SCP
        s1 = "Rahul";
        // 2 , SCP
        s1 = "User";
        // 3 . SCP
        s1 = "Sanjeevone";
        // 3, SCP--> here it is not creating any new string , because this name already present in scp.

        //=========================================================
        //Heap area
        String Str1 = new String("Sanjeev");
        String Str2 = new String("Sanjeev");
        //  2, Heap area
        String Str3  = Str1; // (This doesn't mean this in the SCP) - Str3 -> Str1 (heap area)
        //  2, heap  Str3 -> Str1 -> ( because Str3 pointing to Str1 only).
}}
