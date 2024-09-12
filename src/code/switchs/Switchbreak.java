package code.switchs;

import java.util.Scanner;

public class Switchbreak {
    public static void main(String[] args) {
        // Write a java program that uses a switch statement to print the name of the month
        // corresponding to a given integer value.
        Scanner scanNew =new Scanner(System.in);
        System.out.println("Enter correct value");
        int number = scanNew.nextInt();

        String monthResult;
        //="Invalid month";
        switch (number)
        {
            case 1:
                monthResult="Jan";
                break;
            case 2:
                monthResult="Fab";
                break;
            case 3:
                monthResult="March";
                break;
            case 4:
                monthResult="April";
                break;
            case 5:
                monthResult="May";
                break;
            case 6:
                monthResult="June";
                break;
            case 7:
                monthResult="July";
                break;
            case 8:
                monthResult="Aug";
                break;
            case 9:
                monthResult="Sept";
                break;
            case 10:
                monthResult="Oct";
                break;
            case 11:
                monthResult="Nov";
                break;
            case 12:
                monthResult="Dec";
                break;
            default:
                //System.out.println(monthResult);
                monthResult="Invalid Month";
                break;

        }
        System.out.println("Your selected month is :" + monthResult);
    }
}
