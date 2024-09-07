package learning.datatype;

public class Lab026PreAndPostIncrement {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post


        // pre - increment ++operand
        // value is incremented first and then stored in the result.
        int a =50;// here it is 50
        int b= ++a;// here first it will increase the value of a = 50 to 51, because it is pre increament.
        // after incrementing a, it will increase the vale of b=51, so expect result must be - a=51, b=51.
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a);
        System.out.println(++a+b); // so here what happened it actually pick the value of a=52 due to increment then again incremented to a=53 and added into b.
        System.out.println(a);
        System.out.println(b);
        System.out.println(++b);
        System.out.println(++b+a);// this is interesting
        //--------------------------------------------------
        // Post
        //  value is stored in the result and incremented later
        int a_p = 10;
        int b_p =a_p++;// here first it will Assign the value of a_p = 10 to b_p, because it is post increament.
        // after assigning value to b_p, it will increase the vale of a_p=11, so expect result must be - a_p=11, b_p=10
        System.out.println(a_p);
        System.out.println(b_p);
        System.out.println(a_p++);
        System.out.println(b_p+a_p++);




    }
}
