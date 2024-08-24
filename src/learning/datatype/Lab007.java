package learning.datatype;

public class Lab007 {
    public static void main(String[] args) {
        int IntA=100;
        System.out.println("Total count is -->"+ " "+IntA);// Here we are doing concatenation between string + variable
        //formating-
        // %d--> For integer -> byte/short/int/long.
        System.out.printf("Total number is ==> %d", IntA);
        System.out.println(" ");
        //%s--> string
        String S1= "Sanjeev";
        String S2= "Tiwari";
        System.out.println(S1+" "+ S2);
        System.out.printf("Name of the user is--> %s", S1+S2);
        //%c-> Char.
        // %f -> float.
    }
}
