package learning.datatype;

public class Lab027PreAndPostIncrement {
    public static void main(String[] args) {
        int a=10;
        int b= --a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(--a);
        System.out.println(--a + a--);
        //--------
        int x=20;
        int y=x--;
        System.out.println(x);
        System.out.println(y);
        System.out.println(y-- + x-- + --x);
    }
}
