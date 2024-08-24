package learning.datatype;

public class Lab008 {
    public static void main(String[] args) {
        String S1="Sanjeev";
        int IntA = 10;
        int IntB = 20;
        System.out.println(IntA+IntB);
        System.out.println(IntA+S1);
        System.out.println(IntB+S1);
        System.out.println(S1+IntA);
        System.out.println(S1+IntB);
        System.out.println(S1+IntB*IntA);
        System.out.println(IntA*IntB+S1);
        System.out.println(IntA+IntB+S1);
        System.out.println(IntA+S1+IntB);
        System.out.println(S1+IntA+IntB);
        System.out.println(IntA+IntB+S1+IntA+S1+IntB+IntB);
        // concatenation move from left to right, and if first place its get the string, it will assume every thing string now,so in the last print result would be like this ( sanjeev1020, not sanjeev30)
    }
}
