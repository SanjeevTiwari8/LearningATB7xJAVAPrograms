package important.java.questions;

import java.util.Scanner;

public class CalculatorForOther {
    public static void main(String[] args) {

        Scanner newInput=new Scanner(System.in);        //Other multiplication/divide/ modules

        System.out.println("Provide first number");
        Double firstNumber=newInput.nextDouble();

        System.out.println("Provide second number");
        Double secondNumber = newInput.nextDouble();

        Double multipleResult=firstNumber*secondNumber;
        System.out.println("Result of multi:"+ multipleResult);

        Double divResult=(firstNumber/secondNumber)*100;
        System.out.println("Result of div:"+ divResult + "%");
        newInput.close();


    }
}
