package learning.datatype;

public class Lab006 {
    public static void main(String[] args) {
        // how value stored in and executed.
        byte B =20;
        System.out.println("Old Byte Value"+" "+B);

        B= (byte) (B+5);
        // B=B+1;- this will not work because if you don't add data type it will consider as Int. so we need to provide the correct data type.
        // if you want to initialize the new value in variable 'B'.
        System.out.println("New Byte Value after initialization" + " " +B);
        //1-This value will be converted in to binary.(01010)
        // 10-decimal.
        //machine(0,1)= 00001010- 8 bites
        int IntA=50;
        System.out.println("Old int value"+" "+IntA);

        IntA=IntA+5;
        System.out.println("New int value"+" "+IntA);
    }
}
