package learning.datatype;

public class Lab019 {
    public static void main(String[] args) {
       final int newNumber=45;
        // newNumber=65;- not work, because we are using final key work there so if what to create constant we need to use final keyword.
        System.out.println(newNumber);

        int otherNumber=95;
        otherNumber=500;
        System.out.println(otherNumber);
    }
}
