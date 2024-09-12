package code.switchs;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
        // find day
        Scanner scanValue = new Scanner(System.in);
        System.out.println("Please provide day number value to know the day");

        int readValue = scanValue.nextInt();
        switch (readValue) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thr");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sunday");
                break;



        }
    }
}
