package important.java.questions;

import java.util.Scanner;

public class CalculaterWithScanner {
        public static void main(String[] args) {
        System.out.println("Add of three numbers");
        Scanner newinputNumbers= new Scanner(System.in);

        System.out.println("please enter First number");
        int firstNumber=newinputNumbers.nextInt();

        System.out.println("please enter Second number");
        int secondNumber=newinputNumbers.nextInt();
        //User needs to add more data

        System.out.println("please enter Third number");
        int thirdNumber=newinputNumbers.nextInt();

        int Total= firstNumber+secondNumber+thirdNumber;
        System.out.println(Total);
        newinputNumbers.close();
    }
}
