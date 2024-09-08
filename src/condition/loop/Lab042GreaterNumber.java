package condition.loop;

import java.util.Scanner;

public class Lab042GreaterNumber {
    public static void main(String[] args) {
        Scanner newScanner= new Scanner(System.in);
        System.out.println("Enter first number");

        int firstNumber=newScanner.nextInt();


        System.out.println("Eneter Second number");

        int secondNumber=newScanner.nextInt();

       // System.out.println(Math.max(firstNumber,secondNumber)); we can use Math functions also to find maximum number.

        if (firstNumber>secondNumber)
        {
            System.out.println("First number is grrater");
        }else if (secondNumber>firstNumber){
            System.out.println("Second number is greater");
        }else {
            System.out.println("They are equal");
        }

        }
    }

